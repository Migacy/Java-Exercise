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
	//�W���o�ӬO�̲ª��g�k �g1+2+...+10
	System.out.println(result);
	
	int result2 = 0;
	
	int i = 1;
	
	while(i <= 100)
	{
		result2 += i;
		i++;
	}
	
	System.out.println(result2);
	
	
	//while �᭱������p�G�Otrue, �N�|�~�����U�誺�B��A�p�G�Ofalse�A�N�|���X�j��M��L�X
	//�z�פW�O�i�H�@���[�U�h�A���O�|�o�{�[��᭱�|�ܦ��t��
	
	
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
