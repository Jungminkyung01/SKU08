/*받은볼의 번호를 출력 */
package day03;

public class 뽑는사람 {

	public static void main(String[] args) {
		//로또 번호들을 받을 배열
		int[] rotto = new int[6];
		
		//로또볼 객체 생성
		로또볼 rottoBall = new 로또볼();
		//로또머신 객체 생성
		로또머신 rottoMachine = new 로또머신();
		
		for(int i=0;i<6;i++) {
			rottoMachine.번호섞기(rottoBall.getBall());
			rotto[i] = rottoMachine.번호뽑기();
		}
		
		//로또 번호 출력
		System.out.print("로또 번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(rotto[i] + " ");
		}
	}

}