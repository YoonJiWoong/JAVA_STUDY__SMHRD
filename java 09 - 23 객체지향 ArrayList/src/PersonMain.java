import java.util.Arrays;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 10���� �� ��ȭ��ȣ�� �迭 ����
		
		PersonInfo list[] = new PersonInfo[10];
		System.out.print("�̸� �Է�>>");
		String name = sc.next();
		
		System.out.print("��ȭ ��ȣ >>");
		String number = sc.next();
		
		System.out.print("���� �Է�>>");
		String birth = sc.next();
	
		PersonInfo info = new PersonInfo(name,number,birth);
		
		info.setName(name);
		info.setNumber(number);
		info.setBirth(birth);
		
		
		
//		System.out.println(info.getName()); // name �� ��������
//		System.out.println(info.getNumber()); // number �� ��������
//		System.out.println(info.getBirth()); // birth ��������
		
//		list[0] = info; // ��ȭ��ȣ ������ ����
//		
		// ������ ���� ��ȭ��ȣ��(list)�� ����� �ּ���.
		
		
			System.out.print("�̸� �Է�>>");
			name = sc.next();
			
			System.out.print("��ȭ ��ȣ >>");
			number = sc.next();
			
			System.out.print("���� �Է�>>");
			birth = sc.next();
			
			PersonInfo info2 = new PersonInfo("����","0101010","05");
			list [1]= info2;
			
			
			for(int i =0; i<list.length; i++) {
				System.out.print("�̸� �Է�>>");
				String name1 = sc.next();
				
				System.out.print("��ȭ ��ȣ >>");
				String number1 = sc.next();
				
				System.out.print("���� �Է�>>");
				String birth1 = sc.next();
				
				PersonInfo info3 = new PersonInfo(name1, number1, birth1);
				list[i] = info;
				
			}
		
			System.out.println("�̸����>>"+list[1].getName());
			System.out.println("��ȣ���>>"+list[1].getNumber());
			System.out.println("�������>>"+list[1].getBirth());
		
		System.out.println(Arrays.toString(list));
		
		
		
		
		
	}

}
