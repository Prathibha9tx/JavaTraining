package com.inher.quest3;

public class Oval extends Figures {
	double height;
	
	 
	public Oval(double height) {
		super();
		this.height = height;
	}


	@Override
	void Volume(int x, int y) {		    
			double OvalVol = x*y*height;
			System.out.println("Oval:"+OvalVol);
		}
}
