package com.class31;

public class Registration {
	private String userName;
	private String password;
	private String email;
	public String  getUserName() {
		return userName;
	}
	public String  getpassword() {
		return password;
	}
	public String  getemail() {
		return email;
	}
     public void setEmail(String email) {
    	 if (email.endsWith("@gmail.com")) {
    		 this.email=email;
    		 System.out.println("your username is " +userName+" your email is" +" "+ email);
    	 }
     }
     public void setuserName(String userName) {
        	 if (userName.equals("")) {
        		 System.out.println("It is not valid");
        	 }else if (userName.length()>6){
        		 this.userName=userName;
        		 System.out.println("You created your username");
        	 }
     }
	public void setPassword(String password) {
    	 if(password.equals(userName)) {
    		 System.out.println("invalid password");
    	 }else if (password.length()>6){
    		 this.password=password;
     }
}
}