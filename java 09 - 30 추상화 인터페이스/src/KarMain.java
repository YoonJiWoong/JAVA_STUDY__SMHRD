import java.util.Scanner;

public class KarMain {

	public static void main(String[] args) {
		
		SngKar kar = new SngKar();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ >>");
		int num = sc.nextInt();
		kar.go(num);
		System.out.println("������ġ>>"+kar.sngkarPosition);
		kar.parking();
		//������
		//�ν��Ͱ�
		
		//���� ���� ��ġ�� �˷��ִ� ���α׷�!
		
	}

}
