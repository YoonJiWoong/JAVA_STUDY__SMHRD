package model;

public class Music {


	//�뷡 ����, ����, ����,����ð�, �۰, �ٹ���Ʈ
	//ĸ��ȭ, ������ ��ȣ
	private String songName; // ����
	private String singer; // ����
	private String lyrics; // ����ð�
	private int playTime; //�ʷ� ȯ���ϱ� ���ҷ��� int
	private String songWriter; // �۰
	private String albumArtPath; // �ٹ���Ʈ �̹��� ���
	
	
	// ������ �Ű� ���� : ���, ����,����ð�,�۰
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
