
public class �޼ҵ幮��2_10�������� {

	public static void main(String[] args) {

		int num1 = 8;
		int num2 = 12;
		int result = close10(num1, num2);
		System.out.println("10�� ������ : " + result);

	}

	public static int close10(int num1, int num2) {
		
	//	int result = 0;
		int a = 10 - num1;
		int b = 10 - num2;
		if (a < 0) {
			a = -a;
		} 
		if (b < 0) {
			b = -b;
		}

		if (a > b) {
		//	result = num2;
			return  num2;
		} else if (a < b) {
		//	result = num1;
			return  num1;
		} else  {
		//	result = 0;
			return 0;
		}

		// ����ڰ� ������ ��� ���� �Ѵ�. �� �κп��� ���̰� �ִ�.
		// ��ǻ�ʹ� ���� 1���ۿ� ����... ȿ������ ������!!
		// ����� ���� ���ϰ�!!
		
		
	}

}
