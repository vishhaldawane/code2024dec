package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Chocolate {
	@Id
	@GeneratedValue
	private int chocolateId;
	private String chocolateName; // cake_name
	private float chocolateCost; // cake_cost
	private float chocolateWeight;
	public int getChocolateId() {
		return chocolateId;
	}
	public void setChocolateId(int chocolateId) {
		this.chocolateId = chocolateId;
	}
	public String getChocolateName() {
		return chocolateName;
	}
	public void setChocolateName(String chocolateName) {
		this.chocolateName = chocolateName;
	}
	public float getChocolateCost() {
		return chocolateCost;
	}
	public void setChocolateCost(float chocolateCost) {
		this.chocolateCost = chocolateCost;
	}
	public float getChocolateWeight() {
		return chocolateWeight;
	}
	public void setChocolateWeight(float chocolateWeight) {
		this.chocolateWeight = chocolateWeight;
	}
	
	
}
