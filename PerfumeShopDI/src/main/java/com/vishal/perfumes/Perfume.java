package com.vishal.perfumes;

public class Perfume {

	private int perfumeId;
	private String perfumeName;
	private Fragrance fragrance; //top,middle,base
	private float price;
	
	
//	public Perfume() {
//		super();
//		System.out.println("Perfume() no arg ctor...");
//	}
	public Perfume(int perfumeId, String perfumeName, Fragrance fragrance, float price) {
		super();
		System.out.println("Perfume(int,String,Fragrance,float) arg ctor...");
		this.perfumeId = perfumeId;
		this.perfumeName = perfumeName;
		this.fragrance = fragrance;
		
		this.price = price;
	}
	public int getPerfumeId() {
		return perfumeId;
	}
	public void setPerfumeId(int perfumeId) {
		this.perfumeId = perfumeId;
	}
	public String getPerfumeName() {
		return perfumeName;
	}
	public void setPerfumeName(String perfumeName) {
		this.perfumeName = perfumeName;
	}
	
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Perfume [perfumeId=" + perfumeId + ", perfumeName=" + perfumeName + ", fragrance=" + fragrance
				+ ", price=" + price + "]";
	}
	public Fragrance getFragrance() {
		return fragrance;
	}
	public void setFragrance(Fragrance fragrance) {
		this.fragrance = fragrance;
	}
	
	
	
	
	
}
