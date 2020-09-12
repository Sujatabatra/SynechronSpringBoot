package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQWebController {
	@Autowired
	RabbitMQSender rms;
	
	@GetMapping(value="/producer")
	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId){
		Employee emp=new Employee(empName, empId);
		rms.send(emp);
		return "Message sent to the Rabbit MQ Successfully";
	}

}
