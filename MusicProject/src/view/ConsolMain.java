package view;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import controller.MusicPlayer;

// ȭ�� ǥ�� + ���α׷� ������
public class ConsolMain {
	public static void main(String[] args) { // main ���� ��Ʈ�� �����̽� - �޼ҵ�
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("***M�ݢݢݢݢݢݢݢݢݢݢ�U***");
		System.out.println("****Music Player****");
		System.out.println("**S�ݢݢݢݢݢ�I�ݢݢݢݢݢ�C**");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("���� �÷��̾� ����!! �ݢܢ�");
		Scanner sc = new Scanner(System.in);
		MusicPlayer player = new MusicPlayer();
	//	MusicPlayer player2 = new MusicPlayer(); �����÷��̾� 2�� �ִٰ� ���� ��.
		
		
		
		while (true) {
			System.out.print("[1]���[2]����[3]������[4]������[5]����");
			int choice = sc.nextInt();

			if (choice == 1) { // ���
			String musicInfo = player.play(); // �׳� �����ϰ�!!    // �뷡������ �ǵ����ִ°�!!
			System.out.println("����"+musicInfo+"�� ������Դϴ�.");
			} else if (choice == 2) { // ����

				
				
				
			} else if (choice == 3) { // ������
				String musicInfo = player.PrePlay();
				
				
				if(musicInfo == null) {
					System.out.println("��� ������ �������� �����ϴ�.");
				}else {
					
					System.out.println("����"+musicInfo+"�� ������Դϴ�.");
				}
			
			
			
			} else if (choice == 4) { // ������
				String musicInfo = player.nextPlay();
				if(musicInfo == null) {
					System.out.println("��� ������ �������� �����ϴ�.");
				}else {
					
					System.out.println("����"+musicInfo+"�� ������Դϴ�.");
				}
				
				
				
			} else if (choice == 5) { // ����
				player.stop();
				System.out.println("�ݢݢ��߰�~�ݢݢ�");
				break;
			}

		}

	}

}
