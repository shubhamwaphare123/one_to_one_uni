package com.jsp.person.pan;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson_pan {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Shubham");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	Person p1=new Person();
	p1.setName("xyx");
	p1.setCno(3456643);
	p1.setEmail("xyz@mail.com");
	
	Pan pan1=new Pan();
	pan1.setAddress("mumbai");
	pan1.setPerson(p1);
	
	entityTransaction.begin();
	entityManager.persist(p1);
	entityManager.persist(pan1);
	entityTransaction.commit();
	
	
}}
