import java.util.Scanner;

public class _0916_Q2_���ĺ��ɰ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("====���ĺ� �󵵼� ���ϱ�====");
		System.out.println("�Է� : ");
		String input = sc.nextLine(); // smart (����) Media
		char input_array[] = input.toCharArray(); // �Է��Ѱ� �ɰ���

		char alphabet[] = Alphabet(97, 122); // �ҹ��� �ƽ�Ű �ڵ� 97 ~122
		char Alphabet[] = Alphabet(65, 90); // �빮�� �ƽ�Ű �ڵ� 65 ~ 90
		int index[] = new int[26]; // ī����

		for (int i = 0; i < input_array.length; i++) {
			for (int j = 0; j <= 25; j++) {
				if (input_array[i]== alphabet[j] || input_array[i] == Alphabet[j]) {
					index[j]++;
				}
			
			}
	
		}
		for(int i=0; i<=25;i++) { //���
			System.out.println(alphabet[i]+ " : "+ index[i]);
		}
		
		
	}

	private static char[] Alphabet(int i, int j) {

		// ���ĺ� ũ��
		char array[] = new char[j-i+1];
		for (int k = i, a = 0; k <= j; k++, a++) {
			array[a] = (char)k;
		}

		return array;
	}
	
	
	
	

}
