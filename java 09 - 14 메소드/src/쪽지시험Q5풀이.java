import java.util.Scanner;

public class ��������Q5Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �α��� �� �� �ִ� ����
		String id = "dldmsql";
		String pw = "1214";
		
		// ����ڰ� �Է��� �α��� ����
		String input_id = "";
		String input_pw = "";
		
		// Ű���� �Է� ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			// !���� �ݴ��~~
			System.out.println("id : ");
			input_id = sc.next();
			System.out.println("pw : ");
			input_pw = sc.next();
			
			if(!id.equals(input_id) || !pw.equals(input_pw)) {
				System.out.println("�ٽ�Ȯ���ϼ���");
			}else {
				System.out.println(id + "�� ȯ���մϴ�"); // ���������� �۾���!!
				break;
			}
			
			
			
		}
		

	}

}
