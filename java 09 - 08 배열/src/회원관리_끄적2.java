import java.util.Scanner;

public class ȸ������_����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// 1.ȸ������ 2.�α��� 3.����

		Scanner sc = new Scanner(System.in);

		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		String id;
		String pw;

		System.out.println("==== ȸ������ �ý��� ====");

		
			int i=0;
			while (true) {
				System.out.println("1.ȸ������ 2.�α��� 3.����");
				int choice = sc.nextInt();

				if (choice == 1) // ȸ������
				{
					System.out.println("==== ȸ������ ====");

					System.out.print("ID�Է� : ");
					id_array[i] = sc.next();
					System.out.print("PW�Է� : ");
					pw_array[i] = sc.next();
					System.out.println("���Լ���");
					i = i + 1;
				}

				else if (choice == 2) // �α���
				{
					System.out.println("==== �α��� ====");
					System.out.print("ID�Է� : ");
					id = sc.next();
					System.out.print("PW�Է� : ");
					pw = sc.next();

					int count = 0;
					for(int j=0; j<id_array.length; j++)
					{
						if(id.equals(id_array[j]) && pw.equals(pw_array[j]))
								{
							System.out.println("�α��� ����");
								}
							count++;
						
					} if(count ==0) {
						System.out.println("�α��� ����");
					
					
					}
				}

				else if (choice == 3) // ���α׷� ����
				{
					System.out.println("���α׷��� �����մϴ�.");
					break;
				} else {
					System.out.println("��ȣ�� �ùٸ��� �Է��ϼ���!!");
				}

			}
		
	

	}

}
