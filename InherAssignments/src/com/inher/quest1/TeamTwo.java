package com.inher.quest1;

public class TeamTwo extends Project {
	String[] techStack = {"Java","Spring","Angular"};
	
	@Override
	void doTask(){
		System.out.println("");
		System.out.println("Project implemented using Python");
		
	}
	
	String[] getTechStack(){ 
		return techStack;
	 } 
}
