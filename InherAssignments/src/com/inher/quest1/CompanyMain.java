package com.inher.quest1;

public class CompanyMain {

	public static void main(String[] args) {
		Project project =  new Teamone(); 
		  project.doTask();
		  Teamone Teamone = (Teamone) project;
		  Teamone.softwaresUsed("eclipse", "Jenkins", "maven");
		  Project project1 =  new TeamTwo(); 
		  project1.doTask();
		  TeamTwo TeamTwo = (TeamTwo) project1;
		  String[] techs =  TeamTwo.getTechStack();
		  System.out.println("");
		  System.out.println("TechStacks are");
		  for(String tech :techs) {
			  System.out.println(tech);
		  }
		  
		  
		// call the method of TeamOne 
		// Also call the own method of TeamOne 
		// Follow the same process for TeamTwo 

	}

}
