import java.util.Scanner;

public class ä���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5�� ����
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5]; // ����ڰ� �Է��� ������ �� �迭
		int[] answer = { 3, 5, 1, 1, 1 };

		// 1. ����ڿ��� ������ �Է¹޴� ����
		System.out.println("==ä���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		for (int i = 0; i < input.length; i++) {
			System.out.print(1 + i + "����>>");
			input[i] = sc.nextInt();
		}

		// 2. �Է¹��� ���� ���� ������ ���ϴ� ����
		for (int i = 0; i < answer.length; i++) { // answer.length[5]-> answer.length[4]���ϸ� <=�ƴ϶�<�� ������?
			if (answer[i] == input[i]) {
				System.out.print("O" + " ");
			} else {
				System.out.print("x" + " ");
			}
		}
		// 3. ��ü ������ ����ϴ� ����
		int sum = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == input[i]) {
				sum = sum + 20;
			}
		}
		System.out.println("���� : " + sum);

	}

}
