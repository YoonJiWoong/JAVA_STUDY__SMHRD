import java.util.Scanner;

public class ȸ������ {

	public static void main(String[] args) {
		
		

		// 1.ȸ������ 2.�α��� 3.����

		Scanner sc = new Scanner(System.in);

		String[] id_array = {"","",""};
		String[] pw_array = {"","",""};
		int i =0; // �ε����� �ش��ϴ� i ������ 0���� �ʱ�ȭ

		System.out.println("==== ȸ������ �ý��� ====");

		
			while (true) {
				System.out.println("1.ȸ������ 2.�α��� 3.����");
				int choice = sc.nextInt();

				if (choice == 1) // ȸ������
				{
					System.out.println("==== ȸ������ ====");
					System.out.println("ID�Է� >>");
					id_array[i] = sc.next();
					System.out.println("PW�Է�>>");
					pw_array[i] = sc.next();
					i++;
					System.out.println("\n���Լ���");
				}

				else if (choice == 2) // �α���
				{
					System.out.println("==== �α��� ====");
					// id�� pw�� �Է¹ް� �� ���� id_array�� pw_arry�� �ִٸ�
					// '�α��� ����'�� ����ϰ�, �ƴ϶��'�α��� ����' ����ϼ���
					
					System.out.println("ID>>");
					String input_id = sc.next();
					
					System.out.println("PW>>");
					String input_pw = sc.next();
					int count =0;
					for(int j =0; j<id_array.length; j++)
					{
						if(id_array[j].equals(input_id) && pw_array[j].equals(input_pw))
						{
							System.out.println("�α��� ����");
							count++;
						}
						
					}
					if(count ==0) {
						System.out.println("�α��� ����");
					}
				}

				else if (choice == 3) // ���α׷� ����
				{
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				}

			}
		

}


