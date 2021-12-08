
public class Student {

	// 필드
	private String name;// 이름
	private String stuNumber;// 학번
	private int grade;// 학년
	private int java; // java 과목
	private int web; // web 과목 점수
	private int iot; // iot 과목 점수

	// 메소드 -

	// 생성자 : 객체를 생성하는 메소드
	
	// 전달값? 한번 값 저장? 객체 만듬과 동시에 필드의 값을 초기화 
	
	public Student(String name, String stuNumber) { // 왜 썼을까? - 객체들이 탄생했을때 정보를 넣어서 만들때
		// public 내보낼꺼(반환타입) 있어야 하는데, 생성하는게 목적이라 반환타입 없어 , 뭔가 와야하는데 결과가 없어.. void도 안써야해!
		// 생성자 메소드는 클래스랑 대문자 소문자 까지 완전히 똑같해야해
		// 1. 반환타입이 없다.(void도 쓰지 x)
		// 2. 메소드 이름은 클래스 이름과 동일
		// 3. 메모리에 객체 공간을 할당
		// 4. 생성시에 딱 한 번만 호출 ex) stu1, stu2

		// 안써도 jvm이 알아서 만들어줘~

		this.name = name; // 지역변수 name, 필드의 name과 컴터가 헷갈려~ // this. 을 붙이면 파랑색으로 바뀜
		this.stuNumber = stuNumber;
		System.out.println("학생 객체 생성");

	}
	// JAVA 점수를 수정하는 메소드
	public void changeJava(int java) {
		
		this.java = java;
		
	}
	// Web 점수를 수정하는 메소드
	public void changeWeb(int web) {
		this.web=web;
	}
	// IoT 점수를 수정하는 메소드
	public void changeiot(int iot) {
		this.iot=iot;
	}
	public String getName() {
		return name;
	}
	// 개인
	public int[] score (int java, int web, int iot) {
		this.java=java;
		this.web=web;
		this.iot=iot;
		
		int[] score= {this.java,this.web,this.iot};
		return score;
	
	}
	//개인
	
	public void chage(int java, int web, int iot) {
		this.java=java;
		this.web=web;
		this.iot=iot;
		
	}
	
	
	
	
	

}
