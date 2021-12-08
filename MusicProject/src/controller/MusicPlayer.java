package controller;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;
import model.Music;

// 뮤직플레이어 알고리즘
// Music과 ConsolMain의 중간다리
public class MusicPlayer {
	// 필드에 변수만든거 비슷한????????

	private ArrayList<Music> musicList; // 인퍼런스 뮤직 객체 하나하나
	// <들어갈 데이터 타입>
	private int currentIndex; // 뮤직플레이어에서 현재 재생중인 노래의 인덱스
	// 정수타입은 기본값 :0

	private MP3Player mp3 = new MP3Player(); // 음원재생 클래스

	// ArrayList<타입> 변수명 = new ArrayList<타입>
	// 차이?????

	public MusicPlayer() { // 왜 생성자 쓰는지??
		// 뮤직 플레이어라는 객체를 생성할때 자동으로 음악(객체)들이 셋팅되도록

		musicList = new ArrayList<Music>(); // 빈 ArrayList 생성

		// 혹시 ArrayList<타입> 변수명 = new ArrayList<타입> 한게 외부가 아니라 내부 고정으로 음악 리스트 가져오고??

		Music m = new Music("Butter", "BTS", 180, "작곡가1", "C:\\Users\\smhrd\\Desktop\\music\\bts.mp3"); // 생성자 : 객체를
																										// 생성하는 메소드
		musicList.add(m); // 이렇게 해야하지만, 아래처럼 해도 된다.

		musicList.add(new Music("헤픈엔딩", "헤이즈", 200, "작곡가2", "C:\\Users\\smhrd\\Desktop\\music\\haize_real.mp3")); // 노래
																													// 추가
		musicList.add(new Music("Next Level", "에스파", 150, "작곡가3", "C:\\Users\\smhrd\\Desktop\\music\\next.mp3")); // 노래
																													// 추가

	}

	public String play() { // Music 써서 객체 자체를 넘겨줘 //타입을 레퍼런스타입 하면 m을 그냥 꺼낼 수도 있다
		// 노래 목록중에서 첫번째 노래를 찾아 재생

		Music m = musicList.get(currentIndex);

		String path = m.getMusicPath();
		mp3.play(path);
		
		// 노래제목 (가수)
		return m.getSongName() + "(" + m.getSinger() + ")"; // 문자열 더하기 가능 "(" 더하기 +"("

	}

	public String stop() {

		if (mp3.isPlaying()) { // 실행중일경우
			mp3.stop(); // 멈춘다.
		}

		return "정지";
	}

	public String nextPlay() {
		// 1. 노래 리스트에서 다음곡을 꺼내고
		mp3.stop(); // 멈춘다.

		if (musicList.size() - 1 > currentIndex) { // size() 가로 잊지 말기!!

			Music m = musicList.get(++currentIndex);
			// IndexOutofBoundsException : 인덱스 범위 넘어가~
			// 2. 노래제목(가수) 형태로 리턴

			String path = m.getMusicPath();
			mp3.play(path);

			return m.getSongName() + "(" + m.getSinger() + ")";

		} else {
			return null; // 아무것도 주소값이 없을때...
			// 레퍼런스 : 주소값...
		}

	}

	public String PrePlay() {
		
		mp3.stop(); // 멈춘다.
		
		if (0 < currentIndex) { // size() 가로 잊지 말기!!

			Music m = musicList.get(--currentIndex);
			// IndexOutofBoundsException : 인덱스 범위 넘어가~
			// 2. 노래제목(가수) 형태로 리턴
			
			String path = m.getMusicPath();
			mp3.play(path);
			
			return m.getSongName() + "(" + m.getSinger() + ")";

		} else {
			return null; // 아무것도 주소값이 없을때...
			// 레퍼런스 : 주소값...
		}

	}

}
