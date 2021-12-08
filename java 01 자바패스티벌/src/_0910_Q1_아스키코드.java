
public class _0910_Q1_아스키코드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 65; i<=90; i++)
		{
			System.out.print((char)i+" "); // (char)숫자 : 정수를 아스키코드 문자로 변환 / char형 변수를 int로 형변환 
										   // (int)A : 아스키코드를 숫자로 변환 / 정수값이 저장된 변수를 char형으로 임시 형변환
										   // 
		}
		char a = 'A';
		System.out.println("\n"+(int)a);
	}

}
