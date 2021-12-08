package controller;

import java.util.ArrayList;

import model.Music;

public class MusicPlayer {

	private ArrayList<Music> mA = new ArrayList<Music>();

	public MusicPlayer() {

		mA.add(new Music("��", "����1", 60, "�۰1"));
		mA.add(new Music("��", "����2", 90, "�۰2"));
		mA.add(new Music("��", "����3", 120, "�۰3"));
		mA.add(new Music("��", "����4", 120, "�۰4"));

	}
	
	int count=0;

	public String play() {

		String a = mA.get(count).getMusic();
		return a;

	}

	public String PrePlay() {

		count= count-1;

		if (count == -1) {
			count = mA.size() - 1;
		}

		return mA.get(count).getMusic()+"("+mA.get(count).getsinger()+")";
	}

	public String NextPlay() {
		count=count+1;

		if (count == mA.size()) {
			count = 0;
		}

		return mA.get(count).getMusic();

	}

}
