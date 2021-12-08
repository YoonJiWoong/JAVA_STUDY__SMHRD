import java.util.Arrays;
import java.util.Scanner;

public class StudentSiumlator11 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student[] stuList = new Student[10]; // �л� �迭 ����� 10����� ��� ����, ��ϵ� �л����� ����
		int index = 0; // ����� �л��� ��ġ
		System.out.println("====SMHRD �������� �ý��� ====");

		while (true) {
			System.out.println("[1]�л���� [2]�������� [3]����");

			int choice = sc.nextInt();

			if (choice == 1) {// �л� ��ü ���� ���!

				System.out.print("����� �л� �̸� >>");
				String name = sc.next();
				System.out.print("����� �л� �й� >>");
				String stuNumber = sc.next();

				Student st = new Student(name, stuNumber);
				
				if(index < stuList.length) { // �迭�� ���̸� �����ؼ� <10�̶�� �Ⱦ��°���!
					stuList[index++] = st; // ���� ���� �ٷ� ++ �ص� �ȴ�. index++
					// ����� -> ����ٱ� ���� �������!
				}else {
					System.out.println("�� �̻� �л��� ��� �� �� �����ϴ�.");
				}
				
			} else if (choice == 2) {
				System.out.println("������ �л� �̸� >> ");
				String name = sc.next();//������ �л��� �ִ��� ������ Ȯ��.
				// �ش� �л��� �˻�(������ ��ġ : �迭�� 0������ ���������� ��)
				int stuIndex = -1; // ã�� �л��� ��ġ, �л��� ���� ��츦 ����ؼ� -1
				for(int i =0; i<index; i++) {// index�� �л� ��ϵǸ� �ö�.. ��ϵ� �л���ŭ �˻�
					if(name.equals(stuList[i].getName())) { // stuList[i].name �� ��.. but private �ؼ� �ȵ�!
						// �׷��� �̸� �����ִ� �޼ҵ带 ���� name�� �����´�.
						stuIndex = i;
					}
				}
				if(stuIndex == -1) {
					System.out.println("��ϵ� �л��� �����ϴ�!~~");
				}else {// 1.�ѹ��� �Ѱ��� ����, 2. �ѹ��� 3���� ��� �� ������ �� �ְ�!
					
					System.out.println("JAVA ���� �Է�");
					int java = sc.nextInt();
					System.out.println("Web ���� �Է�");
					int web = sc.nextInt();
					System.out.println("IoT ���� �Է�");
					int iot = sc.nextInt();
					
					stuList[stuIndex].changeJava(java);
					stuList[stuIndex].changeWeb(web);
					stuList[stuIndex].changeiot(iot);
					
				
					System.out.println("�� ���� ����"+Arrays.toString(stuList[stuIndex].score(java, web, iot)));
					
				}
				
				
				
				
			} else if (choice == 3) {
				break;
			}
		}
	}
}
