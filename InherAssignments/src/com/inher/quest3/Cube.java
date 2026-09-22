package com.inher.quest3;

public class Cube extends Figures {


@Override
void Volume(int x, int y) {
		int cubeVol = Math.powExact(x, 3);
		System.out.println("Cube:"+cubeVol);
	}
}
