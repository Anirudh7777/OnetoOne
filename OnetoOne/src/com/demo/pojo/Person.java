package com.demo.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private PersonDetail pDetail;
	
	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public PersonDetail getpDetail() {
		return pDetail;
	}

	public void setpDetail(PersonDetail pDetail) {
		this.pDetail = pDetail;
	}
 

	

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", pDetail=" + pDetail
				+ "]";
	}

	
	
	
}
