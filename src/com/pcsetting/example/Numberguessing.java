package com.pcsetting.example;

import java.util.Scanner;

public class Numberguessing
{
	public static void main(String[] args)
	{
		float number = (float)Math.random();
		number *= 1000.0f;
		
		int number2 = (int)number;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int guess = scanner.nextInt();
			
			if(guess > number2)
			{
				System.out.println("too large!");
			}
			else if(guess < number2)
			{
				System.out.println("too small!");
			}
			else
			{
				System.out.println("BINGO");
			}
		}
	}
}