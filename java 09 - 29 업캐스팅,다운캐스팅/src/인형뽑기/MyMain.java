package �����̱�;

public class MyMain {

	public static void main(String[] args) {
		// ��踦 ���� ������ ������ �̾��ּ���.

		Machine m = new Machine();
		// ��ī�� ���� �̰� ����
		Pika pika = new Pika();
		m.run(pika);
		
		pika.get2(); // �Ϲݸ޼ҵ� �ȴ�!

		// ������ ���� �̰� ����
		Kkobuk kkobuk = new Kkobuk();
		m.run(kkobuk);
		// ���̸� ���� �̰� ����
		Piri piri = new Piri();
		m.run(piri);

		// Doll doll = new Doll(); �߻�Ŭ���� ��ü ������
		// �߻�Ŭ������ ��ü(����) ���� ������ ��ü ������ �Ұ����ϴ�!
		// �ӽ������� �������������� ���� ��� ���� �ʴ´�!!
		// �߻�Ŭ���� ��°��� ����Ŭ�������� ������ �κ��� ���� �س������̱� ������!

		Doll doll = new Doll() {

			@Override
			public void get() {
				// TODO Auto-generated method stub

			}
		};

	//	Doll doll2 = new Pika(); // Ÿ�� �ٲٱ�� ����, �̹� ����Ŷ�!

	};

	// pika.get(); �̰Ͱ� ���̴� ��ü���� �ٸ����� �־��ٶ� �ٸ��� �۵�

}
