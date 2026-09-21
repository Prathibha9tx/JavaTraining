package com.basics.quest4;

public class Training {
 String[] showCourses() {
	 String[] courses={"C","C++","Java","Python"};
	 return courses;
	
 }
 void showTrainers(String...names) {
	for(String name:names) {
		System.out.println("name:"+name);
	}
 }
}
