package 과자;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My my = new My();

		// 바나나, 썬칩, 양파링 먹기
		// 각각의 과자를 나한테 줘서 뜯게 시킴
		바나나 banana = new 바나나();
		my.eat(banana);

		썬칩 sun = new 썬칩();
		my.eat(sun);

		양파링 onion = new 양파링();
		my.eat(onion);

		// 잠깐 소스를 찍어 먹고 싶음.

		Snack snak = onion;
		// 다운캐스팅 - 일시적으로 하위클래스에 있는 기능을 사용하고 싶을때
		양파링 onion1 = (양파링) snak;
		onion1.sourc();

	}

}
