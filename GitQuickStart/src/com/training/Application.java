package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Mahesh","Lokesh","Venkatesh","Devesh");
		
		nameList.forEach(System.out::println);
		
		for(String eachName: nameList) {
			System.out.println(eachName);
		}
		
		Book catch22 = new Book(1984,"Catch-22");
		
		System.out.println(catch22.getName());
	}
}
