package day03;

import java.util.Random;

public class 로또머신 {
	//공번호
		private int ball_num;
		//인덱스
		private int index;

		//기본생성자
		public 로또머신() {}
		
		//랜덤객체 생성
		Random rd = new Random();
		 
		public void 번호섞기(int[] ball) { //로또볼에서 받은 볼배열을 매개변수로 한다.
			//인덱스 번호 랜덤 생성
			index = rd.nextInt(45);
			
			//이미 뽑은 공이면 뽑지 않았던 공이 나올 때 까지 index를 다시 뽑는다.
			if(ball[index] == 0) {
				while(ball[index] == 0) {
					index = rd.nextInt(45);
				}
			}
			
			//뽑은 공번호를 ball_num변수에 저장
			ball_num = ball[index];
			//뽑은 공번호는 0으로 초기화
			ball[index]=0;
			
		}
		
		public int 번호뽑기(){	
			//공번호 반환
			return ball_num;
		}
	}
