


public class ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 7;
		float num3 = 10.0f;
		double num4 = 7.0; // �ڹٿ��� �Ǽ��� �⺻������ double Ÿ������ �ν�
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		System.out.println(num1/num4);
		
		// ���ڿ� Ÿ�� �ٷ��
		String str1 = "10"; //String -> �����
		String str2 = "7";
		System.out.println(str1 +str2);
		System.out.println(num1 +str1); // ����ȯ -> ���� num1�� ���ڿ��� ��ȯ
		
		//����
		//int num = 456;
		//System.out.print("���Ȯ�� :");
		//System.out.print(num / 100 + "00");
		
		//���� 10�� �ڸ� ���� ���ֱ�
		//int number = 456;
		//System.out.println(number-number%100);
		//System.out.println(number/100*100); 
		//System.out.println(number/100+"00");
		
		//������ �ڽ� ���ϱ�
		int orange = 3729;
		int sizeOfBox = 52;
		
		int boxCount = orange/sizeOfBox;
		
		System.out.print("��𾾰� �� �ڽ��� �� �� �ִ� �ڽ��� ����:"+boxCount);
		
		int i = 2;
		System.out.println(++i);
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
	}

}
