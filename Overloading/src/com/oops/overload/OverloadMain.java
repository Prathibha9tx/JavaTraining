package com.oops.overload;

public class OverloadMain {

	public static void main(String[] args) {
		Shape s1 =new Shape();
		s1.area(10);
		s1.area(10.5f);
		int rect = s1.area(5, 9);
		System.out.println("Rectangle:"+rect);
	}

}
