package com.user;

public class StringReverse {

	public static void main(String[] args) {
		
	System.out.println("Hello String");
		
		System.out.println("Reverse String Practice");

		String name="Anwarhussain";
		int len=name.length();
		System.out.println(len);
		String reverse="";
		int i;
		for( i=len-1; i>=0; i--)
		{
			reverse =reverse + name.charAt(i);
			
		}
		System.out.println(reverse);
		
	}

}
