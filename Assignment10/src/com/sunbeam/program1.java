package com.sunbeam;

public class program1 {
	
//	public static void printObjectArray(Object [] arr) {
//		for(Object element:arr) {
//			System.out.println(element +",");
//		}
//	}

	public static <T>void printTypeArray(T [] arr){
		for (T element : arr) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		
		//we have to specify the type of object
		//of class which we want to create an array of
		Integer [] i1 = {10,20,30,40,50};
		printTypeArray(i1);
		
		Double[] d1 = {23.11, 11.22, 40.23};
		program1.<Double>printTypeArray(d1);
		
		Object[]arr = {12.22,12, "sunbeam", "23.45"};
		printTypeArray(arr);

	}

}
