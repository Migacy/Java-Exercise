package com.pcsetting.example;

public class Pivaluecounting {

	public static void main(String[] args) 
	{
		int hit = 0;
		int total = 0;
		
		while(true)
		{
			float x = (float)Math.random() * 2 -1;
			//random �|�Ͳ�1~0�������N�Ʀr; ���H2����|�ܦ�0~2; �b��1 �N�|�b1~-1
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
