import java.util.Scanner;

public class �ʽð����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� :");
		int totalSecond =  sc.nextInt();
		int h = totalSecond / 3600; // �ð��� 1�ð��� 3600�ʶ� �׳� ������.
		int m = totalSecond % 3600 / 60; // ���� ������ 3600(�ð�)���� ���� �������� �ٽ� 60(��)���� ������
		int s = totalSecond % 3600 % 60;//  �ʴ� ������ 3600(�ð�)���� ���� �������� �ٽ� 60(��)���� ���� ��������.
		System.out.println(h + "��" + m + "��" + s + "��");
	}

}
