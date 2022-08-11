/*번호를 섞기
 * 볼배열의 인덱스를 랜덤으로 섞으면서 뽑는다. 
 * 만약여기서 null로 바뀐볼이 뽑히면 랜덤으로 다시섞기
 * 
 * 번호 뽑기
 * return ball:뽑힌 볼의 값을 사람에게 전달 */
package day03;

import java.util.Random;

public class 로또머신 {
	
		private int ball_num; //공번호
		//private: 개인적인 것이라 외부에서 사용할 수 없다. 
		private int index; //인덱스
		//인덱스를 통해 공을 뽑기 때문에 뽑은 직후 null로 만들어준다. 

		//기본생성자
		public 로또머신() {}
		
		//랜덤객체 생성-랜덤한 숫자를 뽑기 위해
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
