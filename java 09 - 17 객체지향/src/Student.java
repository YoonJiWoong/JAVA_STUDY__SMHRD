
public class Student {

	// �ʵ�
	private String name;// �̸�
	private String stuNumber;// �й�
	private int grade;// �г�
	private int java; // java ����
	private int web; // web ���� ����
	private int iot; // iot ���� ����

	// �޼ҵ� -

	// ������ : ��ü�� �����ϴ� �޼ҵ�
	
	// ���ް�? �ѹ� �� ����? ��ü ����� ���ÿ� �ʵ��� ���� �ʱ�ȭ 
	
	public Student(String name, String stuNumber) { // �� ������? - ��ü���� ź�������� ������ �־ ���鶧
		// public ��������(��ȯŸ��) �־�� �ϴµ�, �����ϴ°� �����̶� ��ȯŸ�� ���� , ���� �;��ϴµ� ����� ����.. void�� �Ƚ����!
		// ������ �޼ҵ�� Ŭ������ �빮�� �ҹ��� ���� ������ �Ȱ��ؾ���
		// 1. ��ȯŸ���� ����.(void�� ���� x)
		// 2. �޼ҵ� �̸��� Ŭ���� �̸��� ����
		// 3. �޸𸮿� ��ü ������ �Ҵ�
		// 4. �����ÿ� �� �� ���� ȣ�� ex) stu1, stu2

		// �Ƚᵵ jvm�� �˾Ƽ� �������~

		this.name = name; // �������� name, �ʵ��� name�� ���Ͱ� �򰥷�~ // this. �� ���̸� �Ķ������� �ٲ�
		this.stuNumber = stuNumber;
		System.out.println("�л� ��ü ����");

	}
	// JAVA ������ �����ϴ� �޼ҵ�
	public void changeJava(int java) {
		
		this.java = java;
		
	}
	// Web ������ �����ϴ� �޼ҵ�
	public void changeWeb(int web) {
		this.web=web;
	}
	// IoT ������ �����ϴ� �޼ҵ�
	public void changeiot(int iot) {
		this.iot=iot;
	}
	public String getName() {
		return name;
	}
	// ����
	public int[] score (int java, int web, int iot) {
		this.java=java;
		this.web=web;
		this.iot=iot;
		
		int[] score= {this.java,this.web,this.iot};
		return score;
	
	}
	//����
	
	public void chage(int java, int web, int iot) {
		this.java=java;
		this.web=web;
		this.iot=iot;
		
	}
	
	
	
	
	

}
