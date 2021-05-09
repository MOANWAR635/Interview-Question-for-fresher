package com.user;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		
		 final int no=171;
		
		int temp=no;
		
		int rem,rev=0;
		
		
		while(temp!=0)
		{
			rem=temp%10;
			
			rev=rev*10+rem;
			
			temp=temp/10;	
		}
		
		if (rev==no) {
			System.out.println(no+":Orginal values");
			System.out.println(rev+":Number is a palindrome");
		} 
		
		else 
		{
			System.out.println("Number is not palindrome");
		}
		
		
		
	}

}
