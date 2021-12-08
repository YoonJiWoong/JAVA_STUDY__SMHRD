package 컨트롤러;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import 모델.음악;

public class 음악재생기 {

	private ArrayList<음악> 노래리스트;
	MP3Player mp3 = new MP3Player();

	public 음악재생기() {

		
		노래리스트 = new ArrayList<음악>();
		
		노래리스트.add(new 음악("노래1", "가수1", "C:\\Users\\smhrd\\Desktop\\music\\bts.mp3"));
		노래리스트.add(new 음악("노래2", "소녀시대", "C:\\Users\\smhrd\\Desktop\\music\\next.mp3"));

	}

	int count;

	public String play() {
		
		String path = 노래리스트.get(count).get경로();
		
		 mp3.play(path);
		
		return 노래리스트.get(count).get가수() + " " + 노래리스트.get(count).get노래제목();

	}

	public String nextPlay() {
		mp3.stop();
		if (count == 노래리스트.size() - 1) {
			count = -1;
		}
		String path = 노래리스트.get(++count).get경로();
		
		 mp3.play(path);
		return 노래리스트.get(count).get가수() + " " + 노래리스트.get(count).get노래제목();
	}

}
