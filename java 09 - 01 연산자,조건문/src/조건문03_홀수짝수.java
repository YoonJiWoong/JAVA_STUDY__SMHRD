import java.util.Scanner;

public class ���ǹ�03_Ȧ��¦�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� :");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println(number+"¦���Դϴ�");
			// ���п����� �� =
			// java ������ �� ==
		}
		else {
			System.out.println(number+"Ȧ���Դϴ�.");
		}
	}

}
