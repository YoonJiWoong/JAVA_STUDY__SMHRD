package view;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import controller.MusicPlayer;

// 화면 표현 + 프로그램 시작점
public class ConsolMain {
	public static void main(String[] args) { // main 쓰고 컨트롤 스페이스 - 메소드
		System.out.println("★★★★★★★★★★★★★★★★★★★");
		System.out.println("***M♬♬♬♬♬♬♬♬♬♬♬U***");
		System.out.println("****Music Player****");
		System.out.println("**S♬♬♬♬♬♬I♬♬♬♬♬♬C**");
		System.out.println("★★★★★★★★★★★★★★★★★★★");
		System.out.println("뮤직 플레이어 시작!! ♬♪♩");
		Scanner sc = new Scanner(System.in);
		MusicPlayer player = new MusicPlayer();
	//	MusicPlayer player2 = new MusicPlayer(); 뮤직플레이어 2개 있다고 보면 됨.
		
		
		
		while (true) {
			System.out.print("[1]재생[2]중지[3]이전곡[4]다음곡[5]종료");
			int choice = sc.nextInt();

			if (choice == 1) { // 재생
			String musicInfo = player.play(); // 그냥 시작하게!!    // 노래정보를 되돌려주는게!!
			System.out.println("현재"+musicInfo+"가 재생중입니다.");
			} else if (choice == 2) { // 중지

				
				
				
			} else if (choice == 3) { // 이전곡
				String musicInfo = player.PrePlay();
				
				
				if(musicInfo == null) {
					System.out.println("재생 가능한 이전곡이 없습니다.");
				}else {
					
					System.out.println("현재"+musicInfo+"가 재생중입니다.");
				}
			
			
			
			} else if (choice == 4) { // 다음곡
				String musicInfo = player.nextPlay();
				if(musicInfo == null) {
					System.out.println("재생 가능한 다음곡이 없습니다.");
				}else {
					
					System.out.println("현재"+musicInfo+"가 재생중입니다.");
				}
				
				
				
			} else if (choice == 5) { // 종료
				player.stop();
				System.out.println("♬♬♬잘가~♬♬♬");
				break;
			}

		}

	}

}
