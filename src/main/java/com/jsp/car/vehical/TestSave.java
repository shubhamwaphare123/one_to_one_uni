package com.jsp.car.vehical;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.person.pan.Person;

public class TestSave {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Shubham");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Vehical vehical =new Vehical();
		Registration registration =new Registration();
		vehical.setName("xys");
		vehical.setPrice(123);
		vehical.setRegistation(registration);
		registration.setRegnum(123);
		registration.setCity("panvel");
		registration.setVehical(vehical);
		
		
		
		
		entityTransaction.begin();
		entityManager.persist(registration);
		entityManager.persist(vehical);
		

		
		entityTransaction.commit();
		

	}

}
