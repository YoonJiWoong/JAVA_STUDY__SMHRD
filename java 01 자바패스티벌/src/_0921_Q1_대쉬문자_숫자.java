import java.util.Scanner;
import java.util.stream.Stream;

public class _0921_Q1_대쉬문자_숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요>>");
		int num = sc.nextInt();
		int array[] = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();

		int sum = Num(array);

		System.out.println("합계 : " + sum);

	}

	public static int Num(int array[]) {
		int num = 0;
		int array1[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				num = 6;
			}
			if (array[i] == 1) {
				num = 2;
			}
			if (array[i] == 2) {
				num = 5;
			}
			if (array[i] == 3) {
				num = 5;
			}
			if (array[i] == 4) {
				num = 4;
			}
			if (array[i] == 5) {
				num = 5;
			}
			if (array[i] == 6) {
				num = 6;
			}
			if (array[i] == 7) {
				num = 3;
			}
			if (array[i] == 8) {
				num = 7;
			}
			if (array[i] == 9) {
				num = 6;
			}
			array1[i] = num;
		}
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {

			sum = sum + array1[i];
		}

		return sum;

	}

}
