package com.vishal.perfumes;

import java.util.List;

public class PerfumeShop {
	
	private int shopId;
	private String shopName;
	List<Perfume> listOfPerfumes;//hasA
	
	public PerfumeShop(int shopId, String shopName, List<Perfume> listOfPerfumes) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
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

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Override
	public String toString() {
		return "PerfumeShop [shopId=" + shopId + ", shopName=" + shopName + ", listOfPerfumes=" + listOfPerfumes + "]";
	}
	
	
}
