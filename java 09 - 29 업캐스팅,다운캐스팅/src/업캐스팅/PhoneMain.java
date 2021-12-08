package 업캐스팅;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		SmartPhone smart = new SmartPhone();
		
		phone.call();
		smart.call(); //오버라이딩
		
		//업캐스팅
		//자식 클래스 타입을 부모타입 객체로
		//-->자동형변환
		Phone phone2 = smart; // 자식을 부모에 넣어줘
		// phone2.Wifi(); // 안되!! 형변환 되서
		phone2.call();
		
		//인터넷 되야해!! 
		//다운 캐스팅 : 업캐스팅 된것을 자식클래스 타입으로 일시적 형변환
		SmartPhone smart2 = (SmartPhone) phone2;
		smart2.wifi();
		((SmartPhone) phone2).wifi(); // 이렇게 해도 되!!
		
		
		
		
		// 
		

	}

}
