package com.user;

public class AmstrongNumber {

	public static void main(String[] args) {
		

		//System.out.println("Hello Kamran");
		
		int no=123;
		
		int t1=no,len=0;
		
		while(t1!=0)
		{
			t1=t1/10;
			
			len=len+1;
		}
		
		System.out.println(len);
		
		
		int t2=no;
		int rem;
		int mul=1;
		int arm=0;
		while (t2!=0) 
		{
			rem=t2%10;
			
			for(int i=1;i<len;i++)
			{
				mul=mul*rem;
			}
			
			arm=arm+mul;
			
			t2=t2/10;
			
			if (arm==no)
			{
				System.out.println("Number is Armstrong number ");
				
			}
			else
			{
				System.out.println("number is Armstrong ");
			}
			
		}
		
		
		
		
	}

}
