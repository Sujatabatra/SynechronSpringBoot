package com.sujata.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.sujata.bean.Item;
import com.sujata.service.ItemService;

@RestController
public class MyResources {
	
	@Autowired
	private ItemService itemService;
	
	@JsonView(ProfileViews.ClientView.class)
	@RequestMapping(value="/items",method=RequestMethod.GET)
	public ResponseEntity<Object> getItemDetails(){
		List<Item> items=itemService.getAllItems();
		return new ResponseEntity<Object>(items, HttpStatus.OK);
	}
	
	@RequestMapping(value="/items",method=RequestMethod.POST)
	public ResponseEntity<Object> addItem(@RequestBody Item item){
			itemService.addItem(item);
			return new ResponseEntity<Object>("Item Added", HttpStatus.CREATED);
	}

}
