package com.pcsetting.example;

import java.util.Scanner;

public class Boolean2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		String string = scanner.nextLine();
		
		if(string.equals ("Scissors"))
			{
			System.out.println("Stone");	
			}
		else if(string.equals ("Paper"))
			{
			System.out.println("Scissors");
			}
			else
			{
			System.out.println("Paper");
			}
		//else if 是為了讓排版整齊 所以才往上縮排
	}
	

}
