
public class �ݺ�������3_for�� {

	public static void main(String[] args) {
		// 2�� : 2*1=2 2*2=4 ... 2*9=18
		// 2��,3��....9�� �ݺ�
		// 2�� ����� for�� �����
		// ���� 2��,3��,4�� ������ ����� for�� �����

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println();
			System.out.print(dan + "�� : ");
			for (int num = 1; num <= 9; num++) { //9�� �ݺ�
				System.out.print(dan + "*" + num + "=" + dan * num + " ");
			}

		}

	}

}

