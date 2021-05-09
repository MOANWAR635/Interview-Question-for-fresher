package com.user;

public class Swapingthreenumber {

	public static void main(String[] args) {
		
		int a=10,b=20,t;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		t=b;
		b=a;
		a=t;
		
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
