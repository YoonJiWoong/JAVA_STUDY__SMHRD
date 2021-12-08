
public class 반복문예제2_for문 {

	public static void main(String[] args) {
		// 1~20까지 숫자를 출력해보자
		// 홀수는 양수로 출력을 하고, 짝수는 음수로 출력해보십다.
//		for (int i = 1; i <= 20; i++)
//			if (i%2== 0) { //짝수
//				System.out.print(-i+" ");
//			} else { //홀수
//				System.out.print(i+" ");
//			}
//		
//		System.out.println();
//		
//		for (int i = 1; i<=20;)
//		{
//			System.out.print(" "+i+" ");
//			i++;
//			
//			System.out.print("-"+i+" ");
//			i++;
//		}
		
		for(int even=2, odd=1; even<=20; even+=2, odd+=2){
			System.out.print(odd+" "+ -even + " ");
			// even 하나만 만족해도 성립하니  even<=20 && odd<=19
			
			
		}
	}

}
