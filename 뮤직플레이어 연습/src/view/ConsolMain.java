package view;

import java.util.Scanner;

import controller.MusicPlayer;

public class ConsolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("***M�ݢݢݢݢݢݢݢݢݢݢ�U***");
		System.out.println("****Music Player****");
		System.out.println("**S�ݢݢݢݢݢ�I�ݢݢݢݢݢ�C**");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("���� �÷��̾� ����!! �ݢܢ�");

		// "[1]���[2]����[3]������[4]������[5]����"
		// "����"+musicInfo+"�� ������Դϴ�
		//

		MusicPlayer mp = new MusicPlayer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("[1]���[2]����[3]������[4]������[5]����");
			int input = sc.nextInt();
			
			
			if (input == 1) {
				String musicInfo = mp.play();
				System.out.println("����"+musicInfo+"�� ������Դϴ�.");
				
			} else if (input == 2) {
				
				
			} else if (input == 3) {
				String musicInfo = mp.PrePlay();
				System.out.println("����"+musicInfo+"�� ������Դϴ�.");
				
			} else if (input == 4) {
				String musicInfo = mp.NextPlay();
				System.out.println("����"+musicInfo+"�� ������Դϴ�.");
				
			} else if (input == 5) {
				
			}
		}
		

	}

}
