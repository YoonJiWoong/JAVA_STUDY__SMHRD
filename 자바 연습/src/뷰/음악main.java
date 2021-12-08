package 뷰;

import java.util.Scanner;

import 컨트롤러.음악재생기;

public class 음악main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		음악재생기 음재 = new 음악재생기();
		while(true) {
			
			System.out.println("뮤직파뤼!~");
			System.out.println("1.재생 2.다음곡 3.중지 4. 종료");
			int input = sc.nextInt();
			
			if(input == 1) {
				// 재생
				System.out.println(음재.play());	
				
			}else if(input ==2){
				// 다음곡
				System.out.println(음재.nextPlay());		
			}else if (input ==3) {
				// 중지
			}else if (input ==4) {
				// 종료
			}
		}
		
		
		
	}

}
