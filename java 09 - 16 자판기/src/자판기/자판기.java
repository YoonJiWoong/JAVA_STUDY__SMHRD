package ���Ǳ�;

public class ���Ǳ� {

	int money;

	// 0.�Ա��ѵ�
	public int input1(int m) {
		money = m;
		return money;
	}
	// �ܾ� ���� Ȯ�� 
	
	

	// 1. �޴�����
	public int input2(int m) {

		if (m == 1) {

			money = money - 500;
			System.out.println("Ŀ�� ������");

		} else if (m == 2) {

			money = money - 1000;
			System.out.println("���� ������");
		} else {
			System.out.println("����");
		}

		return money;

	}

}
