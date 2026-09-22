package com.inher.quest1;

public class Teamone extends Project {
	@Override
	void doTask(){
		System.out.println("Project implemented using Java");
		System.out.println("");
	}
	 // create own method as  void 
	void softwaresUsed(String...tools){ 
		System.out.println("Tools are");
		for(String tool:tools) {
			System.out.println(tool);
		}
		System.out.println("");
	}
}
