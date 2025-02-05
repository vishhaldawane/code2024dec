package com.vishal.perfumes;

public class Fragrance {
	private String topNote;
	private String middleNote;
	private String baseNote;
	public Fragrance(String topNote, String middleNote, String baseNote) {
		super();
		System.out.println("Fragrance(String,String,String) ctor invoked...");
		this.topNote = topNote;
		this.middleNote = middleNote;
		this.baseNote = baseNote;
	}
	@Override
	public String toString() {
		return "Fragrance [topNote=" + topNote + ", middleNote=" + middleNote + ", baseNote=" + baseNote + "]";
	}
	
	
	
}
