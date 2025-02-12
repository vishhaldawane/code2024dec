package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Wafers {

	@Id
	@GeneratedValue
	private int wafersId;
	private String wafersName; // cake_name
	private float wafersCost; // cake_cost
	private float wafersWeight;
	public int getWafersId() {
		return wafersId;
	}
	public void setWafersId(int wafersId) {
		this.wafersId = wafersId;
	}
	public String getWafersName() {
		return wafersName;
	}
	public void setWafersName(String wafersName) {
		this.wafersName = wafersName;
	}
	public float getWafersCost() {
		return wafersCost;
	}
	public void setWafersCost(float wafersCost) {
		this.wafersCost = wafersCost;
	}
	public float getWafersWeight() {
		return wafersWeight;
	}
	public void setWafersWeight(float wafersWeight) {
		this.wafersWeight = wafersWeight;
	}
	
	
}
