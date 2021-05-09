package com.user;

import java.util.Scanner;

public class TableProgram {
	public static void main(String[] args) {
		int no;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of table");
		
		no=sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
		 
			System.out.println(no*i);
		}
		//System.out.println(no);
	}
	

}

