import java.util.ArrayList;
import java.util.Scanner;

public class ���ϸ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Poketmon poket1 = new Poketmon("pika", "sunder", 10, 10, 10);
		Poketmon poket2 = new Poketmon("piri", "fire", 20, 30, 5);

		ArrayList<Poketmon> pokectList = new ArrayList<Poketmon>();

		// ���ϸ� ���� ����� (���ϸ� �߰�)
		pokectList.add(poket1);
		pokectList.add(poket2);

		// ���ϸ� ����Ʈ ���
		System.out.println("===���ϸ� ����Ʈ ���===");
		for (int i = 0; i < pokectList.size(); i++) {
			String name = pokectList.get(i).getName();
			System.out.println((i + 1) + "." + name);
		}

		// �θ��� ���ϸ� ����
		System.out.print("ù��° ���ϸ� ��ȣ�Է�>>");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���ϸ� ��ȣ�Է�>>");
		int num2 = sc.nextInt();

		// �տ��� �Է¹��� ��ȣ�� �ε����� Ȱ���Ͽ� ���ݷ� ��������
		int attack1 = pokectList.get(num1 - 1).getAttack();
		int attack2 = pokectList.get(num2 - 1).getAttack();

		if (attack1 > attack2) {
			System.out.println(pokectList.get(num1 - 1).getName() + "�� �̰���ϴ�");
		} else if (attack2 > attack1) {
			System.out.println(pokectList.get(num2 - 1).getName() + "�� �̰���ϴ�");
		} else {
			System.out.println("���º� �Դϴ�.");
		}

	}

}
