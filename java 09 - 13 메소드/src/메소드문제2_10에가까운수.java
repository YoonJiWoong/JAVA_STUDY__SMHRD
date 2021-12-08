
public class 메소드문제2_10에가까운수 {

	public static void main(String[] args) {

		int num1 = 8;
		int num2 = 12;
		int result = close10(num1, num2);
		System.out.println("10에 가까운수 : " + result);

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

		// 사용자가 봤을때 어떨때 뭐를 한다. 그 부분에서 차이가 있다.
		// 컴퓨터는 리턴 1번밖에 안해... 효율보단 가독성!!
		// 결론은 보기 편하게!!
		
		
	}

}
