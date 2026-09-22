package com.user.quest3;

public class Processor {
	 void calculate(double x){
		 System.out.println("SquareRoot:"+(Math.sqrt(x)));
	 }
	 void calculate(int x, int y){
		 System.out.println("Product:"+(x*y));
	 } 
	 void calculate(double x, double y){
		 System.out.println("Difference:"+(x-y));
	 } 
	 void calculate(double x,int y) {
		 System.out.println("Difference:"+(Math.pow(x, y)));
	 }
	 void calculate(int x) {
		System.out.println("Square:"+(x*x)); 
	 } 
}
