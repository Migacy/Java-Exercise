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
		
		//����׽u�N�O ������ �H�U�O���ѽd��
		
		System.out.println(numb3);
		
		int number = 100000;
		//this is the total money i have 
		/* this is the 
		 multiple line subtitle(����) way
		 */
		
		int no = 7 % 4;
		
		System.out.println(no);
		
		//���l�ƪ���k�i�H�P�_�_�ƩάO����
		
		int no1 = 1;
		no1 = no1 + 1;
		no1 = no1 + 1;
		/*�o�ӬO�g���W����k �U���O��֪���k*/
		
		no1++;
		no1--;//���W�S����ҥH�S��P
		
		float no2 = 1.5f;
		
		no2++;
		no2++;//�p���I�����W����]�O�@�˪��g�k
		
		System.out.println(no1);
		System.out.println(no2);
		
		
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.nextLine();
		
		System.out.println(word);
		
		int nummberr = scanner.nextInt(1);
		
		System.out.println(nummberr);
		
		
		
	
		
		
		
		
		
		

	}
}
