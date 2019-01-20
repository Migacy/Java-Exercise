package com.pcsetting.example;

public class Whilecircut {

	public static void main(String[] args) 
	{
	int result = 0;	
	result += 1;
	result += 2;
	result += 3;
	result += 4;
	result += 5;
	result += 6;
	result += 7;
	result += 8;
	result += 9;
	result += 10;
	//上面這個是最笨的寫法 寫1+2+...+10
	System.out.println(result);
	
	int result2 = 0;
	
	int i = 1;
	
	while(i <= 100)
	{
		result2 += i;
		i++;
	}
	
	System.out.println(result2);
	
	
	//while 後面的條件如果是true, 就會繼續執行下方的運算，如果是false，就會跳出迴圈然後印出
	//理論上是可以一直加下去，但是會發現加到後面會變成負數
	
	
	int result3 = 0;
	
	int ii = 1;
	
	while(ii <= 1000000000)
	{
		result3 += ii;
		ii++;
	}
	
	System.out.println(result3);
	}
	}
