package model;
// 음악 데이터를 표현
public class Music {

	//노래 제목, 가수, 가사,재생시간, 작곡가, 앨범아트
	//캡슐화, 데이터 보호
	private String songName; // 제목
	private String singer; // 가수
	private String lyrics; // 재생시간
	private int playTime; //초로 환산하기 편할려고 int
	private String songWriter; // 작곡가
	private String albumArtPath; // 앨범아트 이미지 경로
	private String musicPath; // 음원 파일 경로
	
	// 생성자 : 객체를 생성할때 호출되는 메소드
	// 생성자 특징 : 메소드 반환 타입이 없다(void도 안씀), 메소드 이름이 클래스 이름과 동일
	// 			객체 생성시에 딱 1번만 호출
	public Music(String songName, String singer,int playTime,String songWriter) {
		
		this.songName = songName;
		this.singer= singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
		
		
		
	}
	// 메소드 오버 로딩
	// 메소드의 매개변수의 갯수나, 데이터 타입이 다르면 성립
	
	public Music(String songName, String singer,int playTime,String songWriter, String musicPath){
		
		this.songName = songName;
		this.singer= singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
		this.musicPath=musicPath;
		
		
	}
	
	
	
	
	
	public String getSongName() { // 노래 제목을 꺼내는 메소드
		return songName;
	}

	
	public String getSinger() { // 가수를 꺼내는 메소드
		return singer;
	}

	
	// 음원 경로를 꺼내는 메소드
	public String getMusicPath() {
		return musicPath;
	}
	
	
}
