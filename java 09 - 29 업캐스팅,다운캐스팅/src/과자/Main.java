package ����;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My my = new My();

		// �ٳ���, ��Ĩ, ���ĸ� �Ա�
		// ������ ���ڸ� ������ �༭ ��� ��Ŵ
		�ٳ��� banana = new �ٳ���();
		my.eat(banana);

		��Ĩ sun = new ��Ĩ();
		my.eat(sun);

		���ĸ� onion = new ���ĸ�();
		my.eat(onion);

		// ��� �ҽ��� ��� �԰� ����.

		Snack snak = onion;
		// �ٿ�ĳ���� - �Ͻ������� ����Ŭ������ �ִ� ����� ����ϰ� ������
		���ĸ� onion1 = (���ĸ�) snak;
		onion1.sourc();

	}

}
