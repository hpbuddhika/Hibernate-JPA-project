package com.buddhika.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.buddhika.dto.User;

public class Hibernate {

	public static void main(String[] args) {
	
		User user = new User();
		
		
		user.setName("tom");
		user.setAddress("this is my address");
		user.setDate(new Date());
		user.setDescription("description");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		User user1 = new User();
		
		Session session1 = sessionFactory.openSession();
		session1.beginTransaction();
		user1 = session1.get(User.class,3);
		System.out.print("user name is "+user1.getName());
		System.out.print("user address is  "+user1.getAddress());
		
	
		
		
		
		
		
			
	}

}
