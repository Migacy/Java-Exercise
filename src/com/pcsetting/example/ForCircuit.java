package com.pcsetting.example;

public class ForCircuit {

	public static void main(String[] args) 
	{
		int x ;
		//���ŧi���@���ܼ�
		
		int j = 1;
		
		while(j < 10)
		{
			for(x = 1;x < 10; x++) 
				//��i�N�ܼƫŧi�b�j��A���� ���O�X�F�j�餧���L�{���N�L�k��{���ܼ�
				//�����ܼ�x �ܦ�0; �M��x���Ȧp�G�p�l10�N�|����j�A�������{��;�M��]���@�Ӱj��N�|���W1
			{
				System.out.print( j +"X" + x + "=" + x*j + " ");
			}//�Q�n���E�E���k��M�i�H�Kfor�j��9��
			
			System.out.println();
			//�����
			j++;
		}
	}
}
