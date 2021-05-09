package com.user;

public class LeapYear {

	
		public static void main(String[] args) {
		
			int year=2016;
			
			if(year%4==0)
			{
				System.out.println("leap year");
				
				if (year%100==0) {
					
					if (year%400==0) {
						
						System.out.println("leap year of 400 case");
					}
					
					
					else {
							System.out.println("this is not leap of 400 case");
					}
					
					
				} else {

					System.out.println("leap year 100 case ");
				}
				
			}
			
			else {
				System.out.println("not leap year 4 case ");
			}
			
			
		
	}

}
