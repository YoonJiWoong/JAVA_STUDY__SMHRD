package controller;

import java.util.ArrayList;

import model.Music;

public class MusicPlayer {

	private ArrayList<Music> mA = new ArrayList<Music>();

	public MusicPlayer() {

		mA.add(new Music("가", "가수1", 60, "작곡가1"));
		mA.add(new Music("나", "가수2", 90, "작곡가2"));
		mA.add(new Music("다", "가수3", 120, "작곡가3"));
		mA.add(new Music("라", "가수4", 120, "작곡가4"));

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
