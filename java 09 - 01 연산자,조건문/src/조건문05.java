import java.util.Scanner;

public class ���ǹ�05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ð� �Է��ϼ��� :");
		int time = sc.nextInt();
		if(time<8) {
			System.out.println("�� �ӱ��� :" + (time * 5000));
		}
		else {
			System.out.println("���ӱ��� :" + (40000 + (time - 8)*7500));
	}
	}
}

