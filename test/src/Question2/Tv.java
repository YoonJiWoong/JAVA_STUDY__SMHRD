package Question2;

public class Tv {
	
	int channel;
	public String color;

	public void print() { // ���� Tv�� ���� ���

		System.out.println("Tv�� ���� ä����:" + channel + "�̰�, Tv�� ������ " + color + "�Դϴ�.");

	}

	public void channelUp() {
		channel = channel + 1;
	}

	public void channelDown() {
		channel = channel - 1;
	}


}
