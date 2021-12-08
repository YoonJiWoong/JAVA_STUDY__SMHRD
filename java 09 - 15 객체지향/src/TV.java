
// 게더 타운에 들어가는 tv를 설계해보자!
// class(설계도)
public class TV {
		// 필드 (Data)
		String color; // tv 색상
		double inch; // tv 화면크기
		int channel; // tv의 현재 채널
		int volume; // tv 음량
		String brandName; // 브렌드명(제조사)
		boolean isTurnOn; // 전원 상태
		boolean isLED; // True -> LED False -> oled
		String resolution; // 해상도 - ㅇㅇㅇㅇxㅇㅇㅇㅇ 이런식이니
		
		// 메소드(Logic)
		public void turnOnOFF() {
			isTurnOn = !isTurnOn;
			// 켜진게 꺼지고, 꺼진게 켜지고
			// 전원 상태 제어하는 기능
		}
		
		public void changeCH(int ch) {
			// 2개 작동이면  메소드 2개 만들면 되지~!
			channel = ch;
		}
	
	
	
		// Scanner , Random, Number 등등 다 대문자로 시작행!
		// 둘다 소문자면 눈에 잘 안뜀

	

}
