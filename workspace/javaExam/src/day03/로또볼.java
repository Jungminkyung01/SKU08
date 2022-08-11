/*볼 배열을 만들어서 1~45까지 배열값으로 지정
 * 
 * */
package day03;

public class 로또볼 {
	//공번호들을 저장할 배열
	private int[] ball = new int[45];
	
	//기본생성자
	//공번호들을 ball배열에 저장한다.
	public 로또볼() {
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
	}

	//공번호들을 저장한 배열을 반환
	public int[] getBall() {
		return ball;
	}
}
