import java.util.Scanner;
import java.util.stream.Stream;

public class _0919_Q1_8�ڸ������հ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : " );
		int num= sc.nextInt();;
		while(true) {
		if(10000000<=num && num<=99999999) {
			break;
		}else {
			System.out.print("8�ڸ� ������ �ٽ� �Է� : " );		//������ 8�ڸ��� �Էµǰ� ���?
			num = sc.nextInt();
		}
		}
		
		int array[] = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		int sum = 0;
		for(int i =0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println("�հ� : "+ sum);
	}

}
