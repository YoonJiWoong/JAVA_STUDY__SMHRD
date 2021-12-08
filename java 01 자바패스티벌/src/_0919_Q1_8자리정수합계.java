import java.util.Scanner;
import java.util.stream.Stream;

public class _0919_Q1_8자리정수합계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : " );
		int num= sc.nextInt();;
		while(true) {
		if(10000000<=num && num<=99999999) {
			break;
		}else {
			System.out.print("8자리 정수를 다시 입력 : " );		//정수가 8자리만 입력되게 어떻게?
			num = sc.nextInt();
		}
		}
		
		int array[] = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		int sum = 0;
		for(int i =0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println("합계 : "+ sum);
	}

}
