package ��ĳ����;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		SmartPhone smart = new SmartPhone();
		
		phone.call();
		smart.call(); //�������̵�
		
		//��ĳ����
		//�ڽ� Ŭ���� Ÿ���� �θ�Ÿ�� ��ü��
		//-->�ڵ�����ȯ
		Phone phone2 = smart; // �ڽ��� �θ� �־���
		// phone2.Wifi(); // �ȵ�!! ����ȯ �Ǽ�
		phone2.call();
		
		//���ͳ� �Ǿ���!! 
		//�ٿ� ĳ���� : ��ĳ���� �Ȱ��� �ڽ�Ŭ���� Ÿ������ �Ͻ��� ����ȯ
		SmartPhone smart2 = (SmartPhone) phone2;
		smart2.wifi();
		((SmartPhone) phone2).wifi(); // �̷��� �ص� ��!!
		
		
		
		
		// 
		

	}

}
