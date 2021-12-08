package 모델;

public class 음악 {
	
	
	// 노래제목, 가수
	
	String 노래제목;
	static String 가수 = "소녀시대";
	String 경로;
	
	
	public 음악 (String 노래제목, String 가수, String 경로) {
		
		this.노래제목 = 노래제목;
		this.가수 = 가수;
		this.경로 = 경로;
		
	}
	
	public String get노래제목() {
		return 노래제목;
	}
	public String get가수() {
		return 가수;
	}
	public String get경로() {
		return 경로;
	}

}
