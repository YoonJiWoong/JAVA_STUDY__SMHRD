import java.util.ArrayList;
import java.util.Arrays;

public class PoketMain {

	public static void main(String[] args) {

		// ���ϸ� ���� ��Ȯ�� �� �� ����.
		// ���ϸ� ������ �� ������ ���� �ϴ��� �� �� ����!
		
		
		ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
		Poketmon pika = new Poketmon("��ī��","����",80,60,70);
		Poketmon piri = new Poketmon("���̸�", "��", 90, 40, 50);
		// 5���� �����
		Poketmon ko = new Poketmon("������", "��", 80, 50, 40);
		Poketmon na = new Poketmon("�Ŀ�", "�����", 50, 70, 60);
		Poketmon lee = new Poketmon("�̻��ؾ�", "Ǯ", 90, 90, 30);
		
		
		
		
		//���ϸ� ���� �߰�
		poktList.add(pika);
		poktList.add(piri);
		// 5���� �����
		poktList.add(ko);
		poktList.add(na);
		poktList.add(lee);
		
		System.out.println("��ī�� ���ݷ� : "+poktList.get(0).getAttack());
		
		for(int i=0; i<poktList.size(); i++) {
			
			System.out.print(poktList.get(i).getName()+" ");
			
		}

		
		
		
	}

}
