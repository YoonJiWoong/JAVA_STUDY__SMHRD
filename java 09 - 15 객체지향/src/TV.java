
// �Դ� Ÿ� ���� tv�� �����غ���!
// class(���赵)
public class TV {
		// �ʵ� (Data)
		String color; // tv ����
		double inch; // tv ȭ��ũ��
		int channel; // tv�� ���� ä��
		int volume; // tv ����
		String brandName; // �귻���(������)
		boolean isTurnOn; // ���� ����
		boolean isLED; // True -> LED False -> oled
		String resolution; // �ػ� - ��������x�������� �̷����̴�
		
		// �޼ҵ�(Logic)
		public void turnOnOFF() {
			isTurnOn = !isTurnOn;
			// ������ ������, ������ ������
			// ���� ���� �����ϴ� ���
		}
		
		public void changeCH(int ch) {
			// 2�� �۵��̸�  �޼ҵ� 2�� ����� ����~!
			channel = ch;
		}
	
	
	
		// Scanner , Random, Number ��� �� �빮�ڷ� ������!
		// �Ѵ� �ҹ��ڸ� ���� �� �ȶ�

	

}
