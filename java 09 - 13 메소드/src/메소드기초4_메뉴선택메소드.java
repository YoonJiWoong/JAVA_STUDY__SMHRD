import java.util.Random;

public class �޼ҵ����4_�޴����ø޼ҵ� {

	public static void main(String[] args) {
		// �޴����� �޼ҵ� : ������ָ� ���� ���� ���� �޼ҵ�
		// �޼ҵ� ȣ��
		String menu_name = selectMenu();
		System.out.println("���� ���� ������>>"+menu_name);
	}
	// �޼ҵ� ����
	// �⺻ Ʋ���� �����ϰ� �غ�
	// �ε��� 0~7
	public static String selectMenu() {
		String [] name = {"¥���","���","����","���",
							"�����","�̸�","�쵿","ũ�����뱹"};
		
		Random rd = new Random(); // �޴� �ε����� ���� ����
		int index = rd.nextInt(name.length);
		// 8 : 0 ~ 7
		
		
		return name[index];
	}

}
