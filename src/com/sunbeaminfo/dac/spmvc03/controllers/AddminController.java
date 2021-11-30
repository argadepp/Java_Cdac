package com.sunbeaminfo.dac.spmvc03.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sunbeaminfo.dac.spmvc03.entities.Connection;
import com.sunbeaminfo.dac.spmvc03.services.CustomerServiceImpl;

@CrossOrigin
@EnableWebMvc
@RestController
public class AddminController {

	
	@Autowired
	private CustomerServiceImpl service;
		
    @RequestMapping(value="connection",headers="Accept=application/json" , produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Connection> getConList()
    {
    	List<Connection> conList=this.service.getConList(12);
    	return conList;
    }
	
	
	
	
	
	
}
