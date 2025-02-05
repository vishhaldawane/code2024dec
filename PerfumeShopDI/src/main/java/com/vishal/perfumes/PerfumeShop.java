package com.vishal.perfumes;

import java.util.List;

public class PerfumeShop {
	
	private int shopId;
	List<Perfume> listOfPerfumes;//hasA
	
	public PerfumeShop(int shopId, List<Perfume> listOfPerfumes) {
		super();
		this.shopId = shopId;
		this.listOfPerfumes = listOfPerfumes;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public List<Perfume> getListOfPerfumes() {
		return listOfPerfumes;
	}

	public void setListOfPerfumes(List<Perfume> listOfPerfumes) {
		this.listOfPerfumes = listOfPerfumes;
	}
	
	
}
