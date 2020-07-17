package com.demo.pojo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("OnetoOne");

		EntityManager manager = factory.createEntityManager();
		
		PersonDetail pDetail = new PersonDetail();
		pDetail.setCity("Hyderabad");
		pDetail.setZipcode(500070);
		pDetail.setPhone(123456789);
		
		Person p = new Person();
		p.setFirstName("Anirudh");
		p.setLastName("Chaganty");
		p.setpDetail(pDetail);
		
		pDetail.setP(p);
		
		try {
//			Employee em = manager.find(Employee.class, 51);
//			
//			System.out.println(em.toString());
			manager.getTransaction().begin();
			
			manager.persist(p);
			
			manager.getTransaction().commit();
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
		
		}
		
		
	}

}
