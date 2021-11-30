package com.sunbeaminfo.dac.spmvc03.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.fabric.xmlrpc.base.Struct;
import com.sunbeaminfo.dac.spmvc03.entities.Connection;
import com.sunbeaminfo.dac.spmvc03.entities.Customer;


@Repository
public class CustomerDaoImpl {
	@Autowired
	private SessionFactory factory;

	
	public Customer getCustomer(int custNo) {
		Session session = factory.getCurrentSession();
		return session.get(Customer.class, custNo);
	}
	
	public Connection getCon(int conno) {
		Session session = factory.getCurrentSession();
		return session.get(Connection.class, conno);
	}

	public List<Connection> getConList(int id)	
	{
		String hql="from Connection c where c.Customer_Id=:p_id";
		Session session=factory.getCurrentSession();
		System.out.println(hql);
		Query q=session.createQuery(hql);
		q.setParameter("p_id", id);
		List<Connection> conList=q.list();
		return conList;
	}
	
	
	
}
