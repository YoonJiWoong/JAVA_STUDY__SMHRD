package ��Ʈ�ѷ�;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import ��.����;

public class ��������� {

	private ArrayList<����> �뷡����Ʈ;
	MP3Player mp3 = new MP3Player();

	public ���������() {

		
		�뷡����Ʈ = new ArrayList<����>();
		
		�뷡����Ʈ.add(new ����("�뷡1", "����1", "C:\\Users\\smhrd\\Desktop\\music\\bts.mp3"));
		�뷡����Ʈ.add(new ����("�뷡2", "�ҳ�ô�", "C:\\Users\\smhrd\\Desktop\\music\\next.mp3"));

	}

	int count;

	public String play() {
		
		String path = �뷡����Ʈ.get(count).get���();
		
		 mp3.play(path);
		
		return �뷡����Ʈ.get(count).get����() + " " + �뷡����Ʈ.get(count).get�뷡����();

	}

	public String nextPlay() {
		mp3.stop();
		if (count == �뷡����Ʈ.size() - 1) {
			count = -1;
		}
		String path = �뷡����Ʈ.get(++count).get���();
		
		 mp3.play(path);
		return �뷡����Ʈ.get(count).get����() + " " + �뷡����Ʈ.get(count).get�뷡����();
	}

}
