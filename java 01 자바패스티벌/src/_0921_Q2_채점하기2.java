import java.util.Arrays;
import java.util.Scanner;

public class _0921_Q2_ä���ϱ�2 {

	@SuppressWarnings("unlikely-arg-type") // ��?? String ���� char�� Ÿ�� ���� �ʴٰ� ��������?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("====ä���ϱ�====");
		String ox = sc.next();
		String arrayOx[] = ox.split("");
		// System.out.println(Arrays.toString(arrayOx)); // ����� �迭 �ɰ�������?
		int sum = 0;
		int j = 1;
		for (int i = 0; i < arrayOx.length; i++) {
			if (arrayOx[i].equals("o")) {
				sum += j;
				j++;
			} else {
				j = 1;
			}

		}
		System.out.println("�հ� : "+sum);

	}

}
