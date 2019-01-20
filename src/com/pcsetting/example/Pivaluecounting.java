package com.pcsetting.example;

public class Pivaluecounting {

	public static void main(String[] args) 
	{
		int hit = 0;
		int total = 0;
		
		while(true)
		{
			float x = (float)Math.random() * 2 -1;
			//random 會生產1~0之間任意數字; 乘以2之後會變成0~2; 在減1 就會在1~-1
			float y = (float)Math.random() * 2 -1;
			
			if(x*x +y*y <1)
			{
				hit++;
			}
			
			System.out.println((float)hit / (float)total *4.0f + "    ["+ total +"]");
			
			total++;
			
		}
	}

}
