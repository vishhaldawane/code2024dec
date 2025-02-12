package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Samosa {

	@Id
	@GeneratedValue
	private int samosaId;
	private String samosaName; // cake_name
	private float samosaCost; // cake_cost
	private float samosaWeight;
	public int getSamosaId() {
		return samosaId;
	}
	public void setSamosaId(int samosaId) {
		this.samosaId = samosaId;
	}
	public String getSamosaName() {
		return samosaName;
	}
	public void setSamosaName(String samosaName) {
		this.samosaName = samosaName;
	}
	public float getSamosaCost() {
		return samosaCost;
	}
	public void setSamosaCost(float samosaCost) {
		this.samosaCost = samosaCost;
	}
	public float getSamosaWeight() {
		return samosaWeight;
	}
	public void setSamosaWeight(float samosaWeight) {
		this.samosaWeight = samosaWeight;
	}
	
}
