import java.util.Scanner;

public class _0921_Q1_대쉬문자_문자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫자리 0을 제외한 숫자를 입력해주세요>>");
		String num = sc.next();
		String array[] = num.split(""); // num.split(num)이라고 실수함! 주의하기
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {// switch(비교할거),{대괄호
			// case "문자열" : - 큰따옴표, :는
			case "0":
				count += 6;
				break;
			case "1":
				count += 2;
				break;
			case "2":
				count += 5;
				break;
			case "3":
				count += 5;
				break;
			case "4":
				count += 4;
				break;
			case "5":
				count += 5;
				break;
			case "6":
				count += 6;
				break;
			case "7":
				count += 3;
				break;
			case "8":
				count += 7;
				break;
			case "9":
				count += 6;
				break;

			}

		} 
		System.out.println("합계 : "+ count);

	}

}
