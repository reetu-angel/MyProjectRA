package com.Logic;

public class Authentication {
	
	public String Authenticate(String name, String pwd) {
		
		if(name.equalsIgnoreCase("reetu") && pwd.equals("Test")){
			return "success";
		}
		
		else{
			return "fail";
		}
	}

}
