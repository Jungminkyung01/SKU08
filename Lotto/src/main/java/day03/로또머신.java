package day03;

import java.util.Random;

public class �ζǸӽ� {
	//����ȣ
		private int ball_num;
		//�ε���
		private int index;

		//�⺻������
		public �ζǸӽ�() {}
		
		//������ü ����
		Random rd = new Random();
		 
		public void ��ȣ����(int[] ball) { //�ζǺ����� ���� ���迭�� �Ű������� �Ѵ�.
			//�ε��� ��ȣ ���� ����
			index = rd.nextInt(45);
			
			//�̹� ���� ���̸� ���� �ʾҴ� ���� ���� �� ���� index�� �ٽ� �̴´�.
			if(ball[index] == 0) {
				while(ball[index] == 0) {
					index = rd.nextInt(45);
				}
			}
			
			//���� ����ȣ�� ball_num������ ����
			ball_num = ball[index];
			//���� ����ȣ�� 0���� �ʱ�ȭ
			ball[index]=0;
			
		}
		
		public int ��ȣ�̱�(){	
			//����ȣ ��ȯ
			return ball_num;
		}
	}
