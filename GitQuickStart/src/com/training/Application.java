package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Mahesh","Lokesh","Venkatesh","Devesh");
		nameList.forEach(System.out::println);
	}
}
