package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import javazoom.jl.player.Player;
import model.Music;

public class MusicPlayer {

	private ArrayList<Music> mA = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();

	public MusicPlayer() {

		mA.add(new Music("��", "����1", 60, "�۰1", "C:\\Users\\smhrd\\Desktop\\music\\bts.mp3"));
		mA.add(new Music("��", "����2", 90, "�۰2", "C:\\Users\\smhrd\\Desktop\\music\\haize_real.mp3"));
		mA.add(new Music("��", "����3", 120, "�۰3", "C:\\Users\\smhrd\\Desktop\\music\\next.mp3"));

	}

	int count = 0;

	public String play() {
		String path = mA.get(count).path();
		mp3.play(path);
		String a = mA.get(count).getMusic();
		return a;

	}

	public String PrePlay() {

		mp3.stop();

		count = count - 1;

		if (count == -1) {
			count = mA.size() - 1;
		}
		String path = mA.get(count).path();
		mp3.play(path);

		return mA.get(count).getMusic() + "(" + mA.get(count).getsinger() + ")";

	}

	public String NextPlay() {
		count = count + 1;

		mp3.stop();
		if (count == mA.size()) {
			count = 0;
		}

		String path = mA.get(count).path();
		mp3.play(path);

		return mA.get(count).getMusic();

	}

}
