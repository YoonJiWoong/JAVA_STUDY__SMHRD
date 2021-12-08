package model;

public class Music {


	//노래 제목, 가수, 가사,재생시간, 작곡가, 앨범아트
	//캡슐화, 데이터 보호
	private String songName; // 제목
	private String singer; // 가수
	private String lyrics; // 재생시간
	private int playTime; //초로 환산하기 편할려고 int
	private String songWriter; // 작곡가
	private String albumArtPath; // 앨범아트 이미지 경로
	
	
	// 생성자 매개 변수 : 곡명, 가수,재생시간,작곡가
	public Music(String songName, String singer, int playTime, String songWriter) {
		
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
	}

	
	public String getMusic() {
		return songName;
		
	}
	public String getsinger() {
		return singer;
	}
	
	
	
	
	
}
