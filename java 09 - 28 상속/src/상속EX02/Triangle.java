package ���EX02;

public class Triangle extends Figure {
	// (�غ� x ����) / 2
	private double base;
	private double height;
	private static String name = "�ﰢ��";

	// ���뺯���� �����Ϸ��� satatic ����
	// static�� ������ ���뺯���� �ȴ�.

	// ������
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;

	}

	// ���� ��� �޼ҵ�
	// �޼ҵ� �������̵� : ������
	public double calArea() {
		return base * height / 2;
	}

	public void setName() {
		this.name = "�ﰢ��";
	}

	public static String getName() {
		return name;
	}

}
