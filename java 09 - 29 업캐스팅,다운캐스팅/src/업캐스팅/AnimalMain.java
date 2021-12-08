package 업캐스팅;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog = new Dog();
		Cat cat = new Cat();
		System.out.println(dog.leg); // 위에 있는걸 받았으니 4 //상속받은 다리갯수 출력!
		dog.bark(); // 멍멍이 출력
		///////////////////////////////////////////////
		Animal animal = dog; 
		// 업캐스팅 --> 하위클래스의 타입을 상위 클래스 타입으로  바꾸어주는것
		// 하위에서 상위로 바뀜!!
		// 애니몰에 도그라는 객체를 상위 클래스에 넣어줌... : 이걸 업캐스팅
		animal.bark();
		// 원래는 울음을 짓다! 가 나와야 하는데!!
		// bark' 가 되어 멍멍 짓다가 출력!
		
		
//		System.out.println(animal.color);
		
		//////////////////////
		cry(dog);
		cry(cat);
		// 포괄의 의미
		
	}
	public static void cry(Animal animal) {
		animal.bark();
		
	}
}
