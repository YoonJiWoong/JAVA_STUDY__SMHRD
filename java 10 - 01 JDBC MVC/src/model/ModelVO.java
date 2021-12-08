package model;

public class ModelVO {

	// 회원정보저장
	
	private String id;
	private String pw;
	private String nick;
	
	//생성자
	public ModelVO(String id, String pw, String nick) {
	
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNick() {
		return nick;
	}
	
	
	
}
