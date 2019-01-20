import java.util.Scanner;

public class Tutorial
{
	public static void main(String[] args)
	{
		String aaa = "Hello";
		String bbb = "World";
		String num1 = "one\r";
		String num2 = "one\ntwo\nthree"; 
		
		int number1 = 10;
		float number2 = (number1 +1);
		float trialnumber = 123456789.0f;
		
		float result = (float)number1 / (float)number2;
		
		System.out.println((float)number1 / (float)number2);
		System.out.println(trialnumber);
		
		
		char ch = 't';
		
		System.out.println(ch);
		
		char chh = '\n';
		
		String numb3 = "one" + chh + "two" + chh + "three";
		
		//兩條斜線就是 當行註解 以下是註解範例
		
		System.out.println(numb3);
		
		int number = 100000;
		//this is the total money i have 
		/* this is the 
		 multiple line subtitle(註解) way
		 */
		
		int no = 7 % 4;
		
		System.out.println(no);
		
		//取餘數的方法可以判斷奇數或是偶數
		
		int no1 = 1;
		no1 = no1 + 1;
		no1 = no1 + 1;
		/*這個是寫遞增的方法 下面是更快的方法*/
		
		no1++;
		no1--;//遞增又遞減所以又抵銷
		
		float no2 = 1.5f;
		
		no2++;
		no2++;//小數點的遞增遞減也是一樣的寫法
		
		System.out.println(no1);
		System.out.println(no2);
		
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.nextLine();
		
		System.out.println(word);
		
		int nummberr = scanner.nextInt(1);
		
		System.out.println(nummberr);
		
		
		
	
		
		
		
		
		
		

	}
}
