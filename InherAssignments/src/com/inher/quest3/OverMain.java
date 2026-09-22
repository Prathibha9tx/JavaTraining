package com.inher.quest3;

import java.util.Scanner;

public class OverMain {

	public static void main(String[] args) {
		
		//Create OverMain use scanner to get volume of figures 
		
		Figures figure = new Cube();
		Figures figureCylinder = new Cylinder();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter x value");
		int x = sc.nextInt();
		System.out.println("Please enter y value");
		int y= sc.nextInt();
		System.out.println("Here is the volume");
		figure.Volume(x, y);
		System.out.println("Enter the value of height");
		double height = sc.nextInt();
		Figures figureCubiod = new Cuboid(height);		
		Figures figureOval = new Oval(height);
		figureCubiod.Volume(x, y);
		figureOval.Volume(x, y);
		figureCylinder.Volume(x, y);
		sc.close();
		

	}

}
