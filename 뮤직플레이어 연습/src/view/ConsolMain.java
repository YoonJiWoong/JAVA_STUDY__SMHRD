package view;

import java.util.Scanner;

import controller.MusicPlayer;

public class ConsolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("★★★★★★★★★★★★★★★★★★★");
		System.out.println("***M♬♬♬♬♬♬♬♬♬♬♬U***");
		System.out.println("****Music Player****");
		System.out.println("**S♬♬♬♬♬♬I♬♬♬♬♬♬C**");
		System.out.println("★★★★★★★★★★★★★★★★★★★");
		System.out.println("뮤직 플레이어 시작!! ♬♪♩");

		// "[1]재생[2]중지[3]이전곡[4]다음곡[5]종료"
		// "현재"+musicInfo+"가 재생중입니다
		//

		MusicPlayer mp = new MusicPlayer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("[1]재생[2]중지[3]이전곡[4]다음곡[5]종료");
			int input = sc.nextInt();
			
			
			if (input == 1) {
				String musicInfo = mp.play();
				System.out.println("현재"+musicInfo+"가 재생중입니다.");
				
			} else if (input == 2) {
				
				
			} else if (input == 3) {
				String musicInfo = mp.PrePlay();
				System.out.println("현재"+musicInfo+"가 재생중입니다.");
				
			} else if (input == 4) {
				String musicInfo = mp.NextPlay();
				System.out.println("현재"+musicInfo+"가 재생중입니다.");
				
			} else if (input == 5) {
				
			}
		}
		

	}

}
