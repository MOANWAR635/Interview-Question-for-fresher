package com.user;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
		
		Scanner anwar=new Scanner(System.in);
		System.out.println("Please Enter the year");
		float year=anwar.nextInt();
		
		
		if((year%400==0) || (year%4==0 && year%100!=0))
		{
			System.out.println(year+": This is  leap year");
			
		}
		
		else {
			System.out.println(year+":This  is not leap year");
		}
		
		
		
		
	}

}
