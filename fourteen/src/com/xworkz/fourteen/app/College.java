package com.xworkz.fourteen.app;

public abstract class College {
	public void education()
	{
		System.out.println("invoking education in College");
	}
	public boolean career() {
		System.out.println("invoking career in education");
		return true;
	}
	public boolean transfer() {
		System.out.println("invoking transfer in education");
		return true;
	}
	public void research() {
		System.out.println("invoking research in education");
	}
	public boolean destiny() {
		System.out.println("invoking destiny in education");
		return true;
	}
	public abstract boolean confidence();
	public abstract boolean activities();
	public abstract void exams();
	public abstract boolean result();
	public abstract boolean placements();
}
