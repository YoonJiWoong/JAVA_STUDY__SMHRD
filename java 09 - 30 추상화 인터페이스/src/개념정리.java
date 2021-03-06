
public class 개념정리 {
	/*
	 상속 : 재사용 + 확장 (extends)
	 상속특징 : 
	 1. 다중 상속이 불가능하다.
	 2. 상속 횟수에는 제한이 없다.
	 3. 모든 클래스는 (Object)를 상속 받는다.
	 
	 오버라이딩(재정의) : 부모클래스가 가지고 있던 메소드를 그대로 가지고 와서
	 --> 재사용+확장
	 --> [다형성] 같은 이름의 메소드지만  다르게 다양하게 동작 할 수 있도록 하는것!
	 
	 Casting --> 형변환
	 UpCasting(업케스팅)
	 : 하위클래스 타입을 --> 상위클래스 타입으로 만드는것!
	 
	 Dog dog = new Dog();
	 Animal animal = dog;
	 
	 Animal animal = new Dog(); 도 똑같은거!
	 개는 동물이다!!
	 
	 animal(상위 클래스 타입)==> 상위 클래스에 있는 필드와 메소드만 사용 가능하다.
	 단! 오버라이딩된 메소드는 하위 크래스에 있는 동작을 실행한다!
	 
	 DownCasting(다운케스팅)==> 상위클래스가 서브클래스로 강제 형변환 하는것!
	 단! 업캐스팅된 객체에 한해서만 다운캐스팅 할 수 있다!!!
	 
	 Animal animal = new Animal();
	 Dog dog = (Dog)animal; -->
	 -->동물은 개다....?
	 ==> 하위클래스에 있는 필드와 메소드에 일시적으로나마 사용할 수 있다!
	 */

}
