package com.pcsetting.example;

public class ForCircuit {

	public static void main(String[] args) 
	{
		int x ;
		//先宣告有一個變數
		
		int j = 1;
		
		while(j < 10)
		{
			for(x = 1;x < 10; x++) 
				//亦可將變數宣告在迴圈括號內 但是出了迴圈之後其他程式就無法辨認該變數
				//先讓變數x 變成0; 然後x的值如果小餘10就會執行大括號內的程式;然後跑完一個迴圈就會遞增1
			{
				System.out.print( j +"X" + x + "=" + x*j + " ");
			}//想要做九九乘法當然可以貼for迴圈9次
			
			System.out.println();
			//換行用
			j++;
		}
	}
}
