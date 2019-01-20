package com.pcsetting.example;


public class Shortlonganddouble 
{

	public static void main(String[] args)
	{
		
		System.out.println(add(5,4));
		printAdd(5,4);
	}
	public static int add(float a, int b) {
		return (int) (a+b);
	}
	public static void printAdd(int a, int b) {
		System.out.println(a+b);
	}
}
