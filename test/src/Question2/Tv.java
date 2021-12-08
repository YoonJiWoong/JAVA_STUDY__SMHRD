package Question2;

public class Tv {
	
	int channel;
	public String color;

	public void print() { // 현재 Tv의 상태 출력

		System.out.println("Tv의 현재 채널은:" + channel + "이고, Tv의 색깔은 " + color + "입니다.");

	}

	public void channelUp() {
		channel = channel + 1;
	}

	public void channelDown() {
		channel = channel - 1;
	}


}
