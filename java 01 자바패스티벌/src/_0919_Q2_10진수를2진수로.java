import java.util.Arrays;
import java.util.Scanner;

public class _0919_Q2_10진수를2진수로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >>");
		int number = sc.nextInt();
		int Binary = 0;
		int count = 1;
		int indexNumber = number; 
		while (true) {
			indexNumber = indexNumber / 2;
				
			count++;
			if (indexNumber == 1) {
				break;
			}
		}
		// 내가 했던 실수 
		// Binary = number/2
		// if(Binary = 1) - 이럴경우 Binary는 계속 변하지 않는 number만 계속 나눠주니 따로 저장할 변수 만들어 줘야해

		int i = 0;
		int array[] = new int[count];
		while (true) {
			Binary = number % 2;
			array[i] = Binary;
			number = number / 2;
			i++;
			if (number == 1) {
				array[i] = 1;
				break;
			}

		}

		for (int j = count - 1; j >= 0; j--) {// i를 써도 된다
			System.out.print(array[j] + " ");
			
		}

	}

}
