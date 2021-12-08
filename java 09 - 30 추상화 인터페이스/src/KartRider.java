public interface KartRider {
	//인터페이스 라는 공간이 만들어짐(설계도)
	
	//카드(차)만듬!
	
	//1.인터페이스는 변수가 아닌 상수만 선언 해줄 수 있다!! == final!
	//상수 ==> 변하지 않는 수이다!! 고정된 값!!!
	final int position =0; //시작위치를 지정해주는 필드
	// position = 45; 이런거 안된다!
	// final String name = "승환"; 스트링도 된다
	
	//추상메소드 선언
	
	//앞으로 가는 메소드
	public abstract void go(int num);
	
	//뒤로 가는 메소드
	public abstract void back(int num);
	
	//부스터 메소드
	public abstract void buster(int num);
	
	//인터페이스는 설계도! 이니 기능을 정의하지않고 선언만 해준다!
	//일단 이런 기능이 있을거 같고 구체적인 기능은 나중에 적을거야?
}

