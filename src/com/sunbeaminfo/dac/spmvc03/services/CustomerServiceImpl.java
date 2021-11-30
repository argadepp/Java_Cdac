package com.sunbeaminfo.dac.spmvc03.services;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeaminfo.dac.spmvc03.daos.CustomerDaoImpl;
//import com.sunbeaminfo.dac.spmvc03.entities.User;
import com.sunbeaminfo.dac.spmvc03.entities.Connection;

@Service
public class CustomerServiceImpl {
	@Autowired
	private CustomerDaoImpl dao;

	@Transactional
	public List<Connection> getConList(int id)
	{
		List<Connection> conList=this.dao.getConList(id);
		System.out.println(conList);
		return conList;
	}
	
	
}
