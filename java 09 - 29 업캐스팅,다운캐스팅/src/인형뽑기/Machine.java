package 인형뽑기;

public class Machine {
	
//	Pika pika = new Pika();
//	Kkobuk kkobuk = new Kkobuk();
//	Piri piri = new Piri();
	
	// 각각의 인형을 뽑는 기능 만들기
	// 객체도 오버 로딩
//	public void run(Pika pika) {
//		pika.get();
//	}
//	public void run(Piri piri) {
//		piri.get();
//	}
//	public void run(Kkobuk kkobuk) {
//		kkobuk.get();
//	}
//	
	
	// 하위 클래스를 포괄할 수 있는 메소드 생성 -> 업캐스팅
	// 하위클래스 -> 상위 클래스로!!
	// 하위클래스 포괄 할 수 있는?
	public void run(Doll doll) {
		doll.get();
	}
	
	
	
	//오버로딩 중복정의
	//오버라이딩 재정의
	
	
}
