package model;
// ���� �����͸� ǥ��
public class Music {

	//�뷡 ����, ����, ����,����ð�, �۰, �ٹ���Ʈ
	//ĸ��ȭ, ������ ��ȣ
	private String songName; // ����
	private String singer; // ����
	private String lyrics; // ����ð�
	private int playTime; //�ʷ� ȯ���ϱ� ���ҷ��� int
	private String songWriter; // �۰
	private String albumArtPath; // �ٹ���Ʈ �̹��� ���
	private String musicPath; // ���� ���� ���
	
	// ������ : ��ü�� �����Ҷ� ȣ��Ǵ� �޼ҵ�
	// ������ Ư¡ : �޼ҵ� ��ȯ Ÿ���� ����(void�� �Ⱦ�), �޼ҵ� �̸��� Ŭ���� �̸��� ����
	// 			��ü �����ÿ� �� 1���� ȣ��
	public Music(String songName, String singer,int playTime,String songWriter) {
		
		this.songName = songName;
		this.singer= singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
		
		
		
	}
	// �޼ҵ� ���� �ε�
	// �޼ҵ��� �Ű������� ������, ������ Ÿ���� �ٸ��� ����
	
	public Music(String songName, String singer,int playTime,String songWriter, String musicPath){
		
		this.songName = songName;
		this.singer= singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
		this.musicPath=musicPath;
		
		
	}
	
	
	
	
	
	public String getSongName() { // �뷡 ������ ������ �޼ҵ�
		return songName;
	}

	
	public String getSinger() { // ������ ������ �޼ҵ�
		return singer;
	}

	
	// ���� ��θ� ������ �޼ҵ�
	public String getMusicPath() {
		return musicPath;
	}
	
	
}
