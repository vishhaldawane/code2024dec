package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cake {
	@Id
	@GeneratedValue
	private int cakeId;
	private String cakeName; // cake_name
	private float cakeCost; // cake_cost
	private float cakeWeight; //cake_weight
	
	public Cake() {
		System.out.println("Cake() ctor called..");
	}
	public int getCakeId() {
		return cakeId;
	}
	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	public float getCakeCost() {
		return cakeCost;
	}
	public void setCakeCost(float cakeCost) {
		this.cakeCost = cakeCost;
	}
	public float getCakeWeight() {
		return cakeWeight;
	}
	public void setCakeWeight(float cakeWeight) {
		this.cakeWeight = cakeWeight;
	}
	
	
}
