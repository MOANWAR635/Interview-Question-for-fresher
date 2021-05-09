package com.user;

import java.util.Scanner;

public class LargestNumber {

	
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value fo a");
		 a = sc.nextInt();
		
		 System.out.println("Enter the value fo b");
		 b = sc.nextInt();
		 
		 System.out.println("Enter the value fo c");
		 c = sc.nextInt();
		 
		if(a>b)
		{
			if(a>b&& (a>c))
			{
			System.out.println("a largest from b OR C");
			}
			else {
				System.out.println("a lowest from b OR C");
			}
			
		}
		
		
		
	}

}
