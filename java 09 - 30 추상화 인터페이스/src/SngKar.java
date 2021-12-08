
public class SngKar implements KartRider, KartRider2 {
	
	int sngkarPosition = position;
	
	//메소드 이름 같으면 매개변수 다르면 오버로딩 되서 구현?
	
	@Override // 어노테이션 - 명시만해논거라 지워도 상관없어
	public void go(int num) {
		sngkarPosition +=num;
		
	}

	@Override
	public void back(int num) {
		sngkarPosition -=num;
		
	}

	@Override
	public void buster(int num) {
		sngkarPosition *=num;
		
	}
	//클래스를 상속받을때는 extends
	//인터페이스를 구현할때는 implements : 상속,구현 비슷한 말임.

	@Override
	public void parking() {
		System.out.println("주차");
		
	}
}
