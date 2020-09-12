package com.example.demo;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.jdbcAuthentication()
		.dataSource(dataSource);
		
		
//		auth.jdbcAuthentication()
//		.dataSource(dataSource)
//		.withDefaultSchema()
//		.withUser(
//				User.withUsername("sujata")
//				.password("batra")
//				.roles("ADMIN"))
//		.withUser(
//				User.withUsername("xyz")
//				.password("mno")
//				.roles("USER"));
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder(){
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		//http.authorizeRequest().antMachers("/**").permitAll().and().formLogin();
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
		.and()
		.formLogin();
	}
	


}
