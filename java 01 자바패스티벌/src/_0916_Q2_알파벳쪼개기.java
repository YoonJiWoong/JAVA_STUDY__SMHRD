import java.util.Scanner;

public class _0916_Q2_���ĺ��ɰ��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("====���ĺ� �󵵼� ���ϱ�====");

		System.out.print("�Է�>> ");

		String str = sc.nextLine();
		// sc.nextLine() : �� ������ ���� ����
		// sc.next() : ����� ���� �����Ѵٸ�,
		char[] array = str.toCharArray(); // �Է¹��� �������� char[]�� �ٲ��ش�.
		// toCharArray : String �� char[] �� �ٲ��ִ� ���
		int result[] = new int[26];

		char bigEng[] = new char[26];
		// �빮�� �ֱ�
		for (int i = 0, j = 'A'; j <= 'Z'; i++, j++) {

			bigEng[i] = (char) (j);

		}
		// �ҹ��� �ֱ�
		char smallEng[] = new char[26];

		for (int i = 0, j = 'a'; j <= 'z'; i++, j++) {

			smallEng[i] = (char) (j);

		}

		for (int i = 0; i < array.length; i++) { // i�� �Է¹��� ���ĺ��� ���̸�ŭ

			if (array[i] >= 97 && array[i] <= 122) { // array[i]�� 97�� 122���̶��, �ƽ�Ű�ڵ� �ҹ���

				for (int j = 0; j < smallEng.length; j++) {

					if (array[i] == smallEng[j]) { // �ҹ��ڸ� ���� �迭�� ����ִ� ���ĺ��� �Է��� ���ĺ��� ���� �迭�� ��ġ�ϸ�

						result[j]++; // result �迭�� �ε��� j��°�� ���� 1�� �ø���.
										// �ʱⰪ�� 0 �̴�... �ϰ͵� ���� ���ϸ�.
					}

				}

			}
			// �ҹ��ڿ� ��ġ���� �ʴ´ٸ� �빮�ڿ� ��
			else if (array[i] >= 65 || array[i] <= 90) { // array[i]�� 65�� 90���̶��, �ƽ�Ű�ڵ� �빮��
				// && �ƴѰ�? ������ or�̿��� for ���� result�� Ŀ���� ���������?
				for (int j = 0; j < bigEng.length; j++) {

					if (array[i] == bigEng[j]) { // �빮�ڸ� ���� �迭�� ����ִ� ���ĺ��� �Է��� ���ĺ��� ���� �뿭 ��ġ

						result[j]++; // result �迭�� �ε��� j��°�� ���� 1�� �ø���.

					}

				}

			}

		}

		for (int i = 0; i < result.length; i++) {

			System.out.println(smallEng[i] + " : " + result[i]);
			// �ݺ��� �̿� �ҹ��� �迭�� ���ĺ����� �迭 : ī���� �� ���ǹ�!
		}

	}

}
