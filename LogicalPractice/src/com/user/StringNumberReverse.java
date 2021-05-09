package com.user;

public class StringNumberReverse {
	
	public static void main(String[] args) {
		
		  
	System.out.println("Hello how are you");
	
	int num=12345,rem;
   int  reverse= 0;
	
	while (num!=0) {
		
		rem=num%10;
		//System.out.print(rem);
	 reverse=reverse*10+rem;
	 num=num/10;
		
	}
	System.out.println(reverse);
	
	  
	}

}
