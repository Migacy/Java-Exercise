package com.pcsetting.example;

public class Designatedoperator {

	public static void main(String[] args) 
	{
	int i = 0;
	i+= 1;
	//�W�����@�浥���� i = i+1
	float f = 1;
	
	f/=10;
	f/=10;
	//���P��10�⦸ �]�N�O���F100	
	
	int j = 1;
	j-=100;
	j-=100;
	//��⦸100�����200
	
	int g =20;
	g*=10;
	g*=10;
	//���F�⦸10 �N���󭼤F100
			
	float k = 7;
	k%=2;
	
	//�ʤ��񪺷N��N�O���H�����᭱���Ʀr���l��
	
	System.out.println(i);
	System.out.println(f);
	System.out.println(j);
	System.out.println(g);
	System.out.println(k);
	}

}
