import java.util.Scanner;

public class ����ó���ý��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �л�����

		// �л� �迭 ����� 10����� ��� ����, ��ϵ� �л����� ����
		// [1]�л���� [2]�������� [3]����"

		Scanner sc = new Scanner(System.in);
		�л� array[] = new �л�[2];

		System.out.println("====��������====");

		int index = 0;
		while (true) {
			System.out.print("[1]�л���� [2]�������� [3]���� [4]����Ȯ��");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.print("�л� �̸��� �����ּ���");
				String name = sc.next();
				System.out.print("�й��� �����ּ���");
				String stuNumber = sc.next();

				�л� a = new �л�(name, stuNumber);

				if (index < array.length) {

					array[index++] = a;
				} else {
					System.out.println("��ϺҰ�");
				}

			} else if (input == 2) {

				
				System.out.print("�л� �̸��� �����ּ���");
				String name = sc.next();
				System.out.print("�й��� �����ּ���");
				String stuNumber = sc.next();
				
				for (int i = 0; i < index; i++)	 { // index ���� ���̷� ������ null�� �ִ°�?
				 
					 if (array[i].name.equals(name) && array[i].stuNumber.equals(stuNumber))
					 {
						 while(true) {
							 
							 System.out.println("������ ���� [1]�ڹ� [2]web [3]iot [4]������");
							 
							 int input1 = sc.nextInt();
							 if (input1 == 1) {
								 System.out.print("�����Է�");
								 int score = sc.nextInt();
								 array[i].javaScore(score);
							 } else if (input1 == 2) {
								 System.out.print("���� �Է��ϼ���");
								 int score = sc.nextInt();
								 array[i].webScore(score);
							 } else if (input1 == 3) {
								 System.out.print("���� �Է��ϼ���");
								 int score = sc.nextInt();
								 array[i].iotScore(score);
							 }else if(input1 == 4) {
								 break;
							 }else {
								System.out.println("�Է�Ȯ��");
							 }
							 
							 
						 }
						
						
					}else {
						System.out.println("�Է� �ٽ� Ȯ�����ּ���");
						break;
					}
				
				}
				

			} else if (input == 3) {
				System.out.println("����");
				break;
			} else if (input == 4) {
				System.out.println("�л� �̸��� �����ּ���");
				String name = sc.next();
				System.out.println("�й��� �����ּ���");
				String stuNumber = sc.next();
				

				for (int i = 0; i < index; i++) {
					if (array[i].name.equals(name) && array[i].stuNumber.equals(stuNumber)) {

						System.out.println("�ڹ� :" + array[i].java + " iot :" + array[i].iot + " web :" + array[i].web);
						break;
					}
					
				}

			}

			else {
				System.out.println("�ٽ� �Է����ּ���");
			}

		}

	}

}
