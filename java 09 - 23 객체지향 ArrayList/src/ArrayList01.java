import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {

	public static void main(String[] args) {
		
		String [] name = new String[3];
		
		// ArrayList ����
		ArrayList<String> nameArray = new ArrayList<String>();
		// ArrayList<Ÿ��> ������ = new ArrayList<Ÿ��>
		
		// �� �ʱ�ȭ
		// �迭 ù��°�� �� �ʱ�ȭ 
		name[0] = "��ȯ";
		
		// ArrayList �� �߰� // �� �ڷ� ����.
		nameArray.add("��ȯ");
		nameArray.add("����");
		
		// �� ��������
		System.out.println(name[0]);
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		
		//�� ����
		nameArray.add(1, "����"); //�����ε� ����Ѱ�   2�� �Է��ϸ� ��.. ��ġ, "�Է��Ҳ�"
		System.out.println(nameArray.get(1));
		
		nameArray.add(2, "�ص�"); 
		System.out.println(nameArray.get(2));
		
		//ũ��
		System.out.println("������ ũ��"+name.length);
		System.out.println("ArrayListũ�� "+nameArray.size());
		
		//����
		name[0]=""; // �Ϲݹ迭 --> ������� ������ ����
		// ���� �ϰ� ������ ������ �ʱ�ȭ�� �����ϴ�! ==> ���̰� �������־
		nameArray.remove(1);
		
		System.out.println(name); // name �̶�� �迭�� �����ϴ� �ּҰ��� ��µǴ°ž�!!
		System.out.println(Arrays.toString(name));
		System.out.println(nameArray); // �ȿ��ִ� ���� ���´�.[��ȯ,�ص�,����]
		// ArrayList �⺻������ toString �⺻������ ����.
		// ArrayList�� toString�� �⺻������ �����ϰ� �ִ�!!!!
		
		
		
		
	}

}
