package com.sujata.filters;



import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;


//@Component
public class TrackingFilter extends ZuulFilter {
	
    
    private static final Logger logger = LoggerFactory.getLogger(TrackingFilter.class);

//    @Autowired
    FilterHelper filterHelper;

	 
	//shouldFilter() : returns boolean indicating wheather or not the filter should be active
	@Override
	public boolean shouldFilter() {
		return true;
	}
    // run(): method is a code that is executed everytime a service passed through the filter.
	@Override
	public Object run() throws ZuulException {
		if (isCorrelationIdPresent()) {
	           logger.debug("tmx-correlation-id found in tracking filter: {}. ", filterHelper.getCorrelationId());
	        }
	        else{
	            filterHelper.setCorrelationId(generateCorrelationId());
	            logger.debug("tmx-correlation-id generated in tracking filter: {}.", filterHelper.getCorrelationId());
	        }

	        RequestContext ctx = RequestContext.getCurrentContext();
	        logger.debug("Processing incoming request for {}.",  ctx.getRequest().getRequestURI());
	        return null;

	}

	//filterType() : is used to tell Zuul wheather the filter is pre, route or post
	@Override
	public String filterType() {
		return "pre";
		
	}

	//filterOrder() : returns an integer value indicating what order Zuul should send requestes through different Filters
	@Override
	public int filterOrder() {
		return 1;
	}

	
	private String generateCorrelationId(){
		return java.util.UUID.randomUUID().toString();
	}
	private boolean isCorrelationIdPresent(){
	      if (filterHelper.getCorrelationId() !=null){
	          return true;
	      }

	      return false;
	    }

}
