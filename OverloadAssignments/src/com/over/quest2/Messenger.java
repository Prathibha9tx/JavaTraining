package com.over.quest2;

public class Messenger {
	void sendMail(String message){
		System.out.println(message);
		System.out.println("Status: Email sent successfully.");
		System.out.println("______________________________");
	} 
    void sendMail(String tousername, String message)
    {
    	System.out.println("To:"+tousername);
    	System.out.println(message);
    	System.out.println("Status: Email sent successfully.");
    	System.out.println("______________________________");
    	} 
    void sendMail(String tousername, String message,String subject){
    	System.out.println("To:"+tousername);
    	System.out.println(message);
    	System.out.println("Subject:"+subject);
    	System.out.println("Status: Email sent successfully.");
    	System.out.println("______________________________");
	} 
    
    
}
