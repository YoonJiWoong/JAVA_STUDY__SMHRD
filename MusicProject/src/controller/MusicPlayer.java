package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import model.Music;

// �����÷��̾� �˰���
// Music�� ConsolMain�� �߰��ٸ�
public class MusicPlayer {
	// �ʵ忡 ��������� �����????????

	private ArrayList<Music> musicList; // ���۷��� ���� ��ü �ϳ��ϳ�
	// <�� ������ Ÿ��>
	private int currentIndex; // �����÷��̾�� ���� ������� �뷡�� �ε���
	// ����Ÿ���� �⺻�� :0

	private MP3Player mp3 = new MP3Player(); // ������� Ŭ����

	// ArrayList<Ÿ��> ������ = new ArrayList<Ÿ��>
	// ����?????

	public MusicPlayer() { // �� ������ ������??
		// ���� �÷��̾��� ��ü�� �����Ҷ� �ڵ����� ����(��ü)���� ���õǵ���

		musicList = new ArrayList<Music>(); // �� ArrayList ����

		// Ȥ�� ArrayList<Ÿ��> ������ = new ArrayList<Ÿ��> �Ѱ� �ܺΰ� �ƴ϶� ���� �������� ���� ����Ʈ ��������??

		Music m = new Music("Butter", "BTS", 180, "�۰1", "C:\\Users\\smhrd\\Desktop\\music\\bts.mp3"); // ������ : ��ü��
																										// �����ϴ� �޼ҵ�
		musicList.add(m); // �̷��� �ؾ�������, �Ʒ�ó�� �ص� �ȴ�.

		musicList.add(new Music("���¿���", "������", 200, "�۰2", "C:\\Users\\smhrd\\Desktop\\music\\haize_real.mp3")); // �뷡
																													// �߰�
		musicList.add(new Music("Next Level", "������", 150, "�۰3", "C:\\Users\\smhrd\\Desktop\\music\\next.mp3")); // �뷡
																													// �߰�

	}

	public String play() { // Music �Ἥ ��ü ��ü�� �Ѱ��� //Ÿ���� ���۷���Ÿ�� �ϸ� m�� �׳� ���� ���� �ִ�
		// �뷡 ����߿��� ù��° �뷡�� ã�� ���

		Music m = musicList.get(currentIndex);

		String path = m.getMusicPath();
		mp3.play(path);
		
		// �뷡���� (����)
		return m.getSongName() + "(" + m.getSinger() + ")"; // ���ڿ� ���ϱ� ���� "(" ���ϱ� +"("

	}

	public String stop() {

		if (mp3.isPlaying()) { // �������ϰ��
			mp3.stop(); // �����.
		}

		return "����";
	}

	public String nextPlay() {
		// 1. �뷡 ����Ʈ���� �������� ������
		mp3.stop(); // �����.

		if (musicList.size() - 1 > currentIndex) { // size() ���� ���� ����!!

			Music m = musicList.get(++currentIndex);
			// IndexOutofBoundsException : �ε��� ���� �Ѿ~
			// 2. �뷡����(����) ���·� ����

			String path = m.getMusicPath();
			mp3.play(path);

			return m.getSongName() + "(" + m.getSinger() + ")";

		} else {
			return null; // �ƹ��͵� �ּҰ��� ������...
			// ���۷��� : �ּҰ�...
		}

	}

	public String PrePlay() {
		
		mp3.stop(); // �����.
		
		if (0 < currentIndex) { // size() ���� ���� ����!!

			Music m = musicList.get(--currentIndex);
			// IndexOutofBoundsException : �ε��� ���� �Ѿ~
			// 2. �뷡����(����) ���·� ����
			
			String path = m.getMusicPath();
			mp3.play(path);
			
			return m.getSongName() + "(" + m.getSinger() + ")";

		} else {
			return null; // �ƹ��͵� �ּҰ��� ������...
			// ���۷��� : �ּҰ�...
		}

	}

}
