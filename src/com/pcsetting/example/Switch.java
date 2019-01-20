package com.pcsetting.example;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		
		while(true)
		{
			int day = scanner.nextInt();
			
			switch(day)
			{
			case 1:
				System.out.println("Wear new clothe");
				break;
				
			case 2:
				System.out.println("Hungry");
				break;
				
			case 3:
				System.out.println("Mountain Climbing");
				break;
				
			case 4:
				System.out.println("Taking exam");
				break;
				
			case 5:
				System.out.println("Dancing");
				break;
				
			case 6:
				System.out.println("Go to Douliu");
				break;
			case 7:
				System.out.println("Take a Break");
				break;
			}	
		}
		
		
		//下面是最簡單的寫法如果不用SWITCH
		
		/*if(day == 1) 
		{
			System.out.println("Wear new clothe");
		}
		else if(day == 2)
		{
			System.out.println("Hungry");
		}
		else if(day == 3) {
			System.out.println("Mountain Climbing");
		}
		else if(day == 4) 
		{
			System.out.println("Taking exam");
		}
		else if(day == 5)
		{
			System.out.println("Dancing");
		}
		else if(day == 6)
		{
			System.out.println("Go to Douliu");
		}*/
	}

}
