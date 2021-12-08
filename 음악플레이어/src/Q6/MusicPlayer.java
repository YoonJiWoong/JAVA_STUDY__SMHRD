package Q6;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("====뮤직플레이어====");
		
		
		
		MusicController m = new MusicController();
		
		while(true) {
			System.out.println("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("====등록====");
				System.out.print("제목 :");
				String title = sc.next();
				System.out.print("가수 :");
				String singer = sc.next();
				System.out.print("시간 :");
				int playTime = sc.nextInt();
				MusicVO mv = new MusicVO(title, singer, playTime);
				m.addMusic(mv);
				
			} else if (input == 2){
				m.musicList();
				
			}else if (input == 3) {
				m.play();
			} else if (input == 4) {
				m.preplay();
				
			}else if (input == 5) {
				m.nextplay();
			}else if (input == 6) {
				break;
			}else {
				System.out.println("정확한 숫자를 입력해주세요");
			}
		
		
		}
		
			
		
	}

	
	
}
