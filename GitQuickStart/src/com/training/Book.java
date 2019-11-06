package com.training;

public class Book {

	public static final double disc = 0.23;
	
	private long id;
	private String name;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static double getDisc() {
		return disc;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
	
}
