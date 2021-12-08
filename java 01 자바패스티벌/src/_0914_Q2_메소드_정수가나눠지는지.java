
public class _0914_Q2_메소드_정수가나눠지는지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1,num2);
		System.out.println("결과확인 : " + result);
	}

	private static boolean isDivide(int num1, int num2) {
		
		return num1%num2 == 0;
	 
	}

}
