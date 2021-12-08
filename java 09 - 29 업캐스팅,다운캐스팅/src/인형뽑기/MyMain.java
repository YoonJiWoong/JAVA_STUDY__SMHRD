package 인형뽑기;

public class MyMain {

	public static void main(String[] args) {
		// 기계를 통해 각각의 인형을 뽑아주세요.

		Machine m = new Machine();
		// 피카츄 인형 뽑고 싶음
		Pika pika = new Pika();
		m.run(pika);
		
		pika.get2(); // 일반메소드 된다!

		// 꼬북이 인형 뽑고 싶음
		Kkobuk kkobuk = new Kkobuk();
		m.run(kkobuk);
		// 파이리 인형 뽑고 싶음
		Piri piri = new Piri();
		m.run(piri);

		// Doll doll = new Doll(); 추상클래스 객체 못만듬
		// 추상클래스는 몸체(구현) 없기 때문에 객체 생성이 불가능하다!
		// 임시적으론 생성가능하지만 거의 사용 하지 않는다!!
		// 추상클래스 라는것은 하위클래스에서 구현할 부분을 정의 해놓은거이기 때문에!

		Doll doll = new Doll() {

			@Override
			public void get() {
				// TODO Auto-generated method stub

			}
		};

	//	Doll doll2 = new Pika(); // 타입 바꾸기는 가능, 이미 만든거라!

	};

	// pika.get(); 이것과 차이는 객체별로 다른값을 넣어줄때 다르게 작동

}
