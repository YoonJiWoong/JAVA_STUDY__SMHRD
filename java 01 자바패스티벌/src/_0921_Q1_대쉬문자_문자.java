import java.util.Scanner;

public class _0921_Q1_�뽬����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ���>>");
		String num = sc.next();
		String array[] = num.split(""); // num.split(num)�̶�� �Ǽ���! �����ϱ�
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {// switch(���Ұ�),{���ȣ
			// case "���ڿ�" : - ū����ǥ, :��
			case "0":
				count += 6;
				break;
			case "1":
				count += 2;
				break;
			case "2":
				count += 5;
				break;
			case "3":
				count += 5;
				break;
			case "4":
				count += 4;
				break;
			case "5":
				count += 5;
				break;
			case "6":
				count += 6;
				break;
			case "7":
				count += 3;
				break;
			case "8":
				count += 7;
				break;
			case "9":
				count += 6;
				break;

			}

		} 
		System.out.println("�հ� : "+ count);

	}

}
