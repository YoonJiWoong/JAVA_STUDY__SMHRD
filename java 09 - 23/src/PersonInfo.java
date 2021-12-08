
public class PersonInfo {

	// 이름
	private String name;
	// 전화번호
	private String number;
	// 생일
	private String birth;
	
	
	// 정보를 수정/가져오기 위해서
	// get, set 활용
	
	public String getName() { // 불러오기?
		return name;
	}
	public void setName(String name) { // 수정하기?
		this.name = name; // this -> 헷갈리니깐 써줘~ 위에 파란글씨 name
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) { 
		this.number = number;
	}
	public String getBirth() { 
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public PersonInfo(String name, String number, String birth) {
	//	super();  나중에 설명해주심. 클래스에도 상하 관계가 있는데.. 자기보다 상 가르켜라
		this.name = name;
		this.number = number;
		this.birth = birth;
	}
	// setter, getter 나중에 폰 바꿀때! 그때 그때 수정~!
	
	
	
	
	
	
}
