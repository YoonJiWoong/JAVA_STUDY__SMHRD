import java.util.Scanner;

public class �޼ҵ幮��1_�����Է°��� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = getValue(num1, num2);
		System.out.println("���Ȯ�� : " + result);

	}

	public static int getValue(int num1, int num2) {

		int result = num1 - num2;
		if (result < 0) {
			result = -result;
			// result *= -1; �̷� ����� �ִ�!
			return result;
		}
			
		if(result>0) {
			return result;
	}else
	return result;
		}
	

		
	}


