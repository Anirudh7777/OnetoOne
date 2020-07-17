package com.demo.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Address
 *
 */
@Entity
@Table(name="PersonDetail")
public class PersonDetail {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String city;
	private int zipcode;
	private int phone;
	
	@OneToOne(mappedBy="pDetail")
	private Person p;
	
	

	public PersonDetail() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", zipcode=" + zipcode + ", phone=" + phone + "]";
	}
   
}
