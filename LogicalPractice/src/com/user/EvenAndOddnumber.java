package com.user;

import java.util.Scanner;

public class EvenAndOddnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number");
		int no=sc.nextInt();
		
		if(no%2==0)
		{
			System.out.println("number is Even");
		}
		else {
			System.out.println("number is Odd");
		}
	}

}
