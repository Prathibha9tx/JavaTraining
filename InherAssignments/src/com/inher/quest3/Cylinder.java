package com.inher.quest3;

public class Cylinder extends Figures {

	@Override
	void Volume(int x, int y) {
			double cylinderVol = 3.142 * Math.pow(x, 2);
			System.out.println("cylinder:"+cylinderVol);
			
		}
}
