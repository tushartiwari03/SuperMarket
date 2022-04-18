package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SuperMarket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String quantity;
	private String dateOfAdding;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDateOfAdding() {
		return dateOfAdding;
	}
	public void setDateOfAdding(String dateOfAdding) {
		this.dateOfAdding = dateOfAdding;
	}
	public SuperMarket(int id, String name, String quantity, String dateOfAdding) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.dateOfAdding = dateOfAdding;
	}
	public SuperMarket() {
		
	}
	@Override
	public String toString() {
		return "SuperMarket [id=" + id + ", name=" + name + ", quantity=" + quantity + ", dateOfAdding=" + dateOfAdding
				+ "]";
	}

}
