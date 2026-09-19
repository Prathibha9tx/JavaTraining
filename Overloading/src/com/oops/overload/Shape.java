package com.oops.overload;

public class Shape {
   void area(int side) {
	   System.out.println("Square:"+(side*side));
   }
   void area(double radius) {
	   System.out.println("Circle :"+(Math.PI*radius*radius));
   }
   int area(int x, int y) {
	   return x*y;
   }
   
}
