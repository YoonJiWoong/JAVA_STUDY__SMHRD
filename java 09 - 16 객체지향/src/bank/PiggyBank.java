package bank;




public class PiggyBank {
	//�ʵ�
	// ���������� - �ʵ忡�� ���� �� �־�!
	private int money; // ���ݵ� ��
	
	// �޼ҵ� �ϳ��� �ܼ��ϰ� �ϳ��� ��Ȱ�� �ϰ� ...
	
	//�޼ҵ�
	// 1. ���� �ִ� ��� (deposit)
	// �Է����� : ������ 1�� (�Էµ� ��)
	// ��ȯŸ�� : ������ 1�� (���� �����뿡 ����ִ� ������ �ݾ�)
	public int deposit(int input_money) {
		// ��ĳ�� ���� �ʱ�
		// ��� ���� �ʱ�
		// �ֿܼ�? gui?�� �� ������? �� ������...
		// �۾��� �ֿܼ뿡 Ưȭ / Ȱ�뵵 ������.. ȣȯ�� ������
		
		
		
		// �ʵ�� �Ķ���
		// �������� ����
		
		money += input_money; // money = money+input;
		
		return money;
		// return money
}
	// 2. ���� ���� ���(withDraw)
	// �Է����� : ������ 1��(���� ���� �ݾ�)
	// ��ȯŸ�� : ���� 1��(��ݿ� �����ϸ� true, �����ϸ� false)
	
	public boolean withDraw (int out_money) {
		
		
		if(money>=out_money) {
			money -= out_money;
			return true; // ���� �����Ҷ��� ���� ������ ���� �������� �A��.
		}else {
			return false;
		}
		
	}
	// 3. ���� �ܾ� Ȯ�� ��� (getMoney)
	// �Է����� : X
	// ��ȯŸ�� : ������ 1�� (�����ܾ�)
	
	public int getMoney() {
		return money;
	}//�Է����� ���̵� �����.
	
	

		
	}

	
