package 업캐스팅;

public class Dog extends Animal{

	String color = "white";
	
	@Override //b누르고 컨트롤 스페이스
	public void bark() {
		System.out.println("멍멍 짓다.");
		
	}
	
}
