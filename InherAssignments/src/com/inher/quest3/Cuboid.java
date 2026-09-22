package com.inher.quest3;

public class Cuboid extends Figures {
	double height;
		 
	public Cuboid(double height) {
		super();
		this.height = height;
	}



	@Override
	void Volume(int x, int y) {
		System.out.println("Value of height is"+height);
			double cuboidVol = x*y*height;
			System.out.println("Cubiod:"+cuboidVol);
		}
}
