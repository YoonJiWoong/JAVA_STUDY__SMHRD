
public class Main {

	public static void main(String[] args) {
		// 학생 성적을 관리하는 시스템
		// 학생 객체가 중요하다.
		
		// 객체 만들기
		// 클래스명 변수명 = new 클래스명();
		//				생성자 호출
		// 생성자 : 클래스로부터 객체를 생성 (메모리에 할당) 하는 메소드
		
	
		Student stu1 = new Student("황해도","111111"); // 객체 만들기 1  
		Student stu2 = new Student("임승환","222222"); // 객체 만들기 2
		Student stu3 = new Student("서대희","333333");
		// 생성자 정의 하지 않고 쓰는건 piggybank , 생성자 정의는 : 성적관리 같은거 만들때.. 학생들 학번, 이름 정도 필요하니깐
		
		stu1.changeJava(90);
		stu1.changeJava(85);
		stu1.changeJava(10);
		
		
		 //레퍼런스 타입(String 같은 것들...)들은 그 안에 아무것도 안들어있다. null
		// 다른것들은 0으로 되어있다. 기본값 : 0 
		
		
		
		
	}

}
