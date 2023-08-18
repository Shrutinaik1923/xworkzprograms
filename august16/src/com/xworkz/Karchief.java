package com.xworkz;

public class Karchief {
	private String brand;
	private String type;
	private int price;
	private String color;
	private boolean washable;
	private int size;
	private boolean isEmbroidery;

	public Karchief() {

	}

	public Karchief(String brand, String type, int price, String color, boolean washable, int size,
			boolean isEmbroidery) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
		this.washable = washable;
		this.size = size;
		this.isEmbroidery = isEmbroidery;
	}

	public String toString() {
		System.out.println("invoking toString() in Kercheif");
		return "Brand:" + brand + " Type:" + type + " Price:" + price + " Color:" + color + " Washable:" + washable
				+ " Size:" + size + " Embroidery:" + isEmbroidery;
	}

}
