
public class �޼ҵ����3_�����ε�_��ո޼ҵ� {

	public static void main(String[] args) {
		
		// �޼ҵ� ȣ��
		double rs = mean(60.5,75.3,98.5);
		// ��� ��� (syso)
		System.out.println("��� : " + rs);
		
		
		
		
	}
	// �޼ҵ� ���� : kor, eng, math 3���� ���� �Է�
	public static double mean(int kor,int eng,int math) {
	// ����Ѵٸ� �Ҽ��� �����°� ������ double
		
		double result = 0;
		result = (kor + eng + math) / (double)3;
		// �׳� / ���� ������ �������� ����!! �׷��� ���� ����ȯ�� ���ִµ�
		// �տ��ٰ� (double)�� �ᵵ �ǰ�, �ڿ��ٰ� (double)�� �ᵵ ��, ���ʿ� 3.0�� ������?
		return result;
	}
	
	// �޼ҵ� �ߺ� ���� : ���� �̸��� �޼ҵ带 �����ϴ� ��
	// �Ű������� ������ Ÿ���̳� ������ �ٸ��� �ۼ��ؾ� ����
	public static double mean(int kor,int eng,int math, int java) {
		
		double result = 0;
		result = (kor + eng + math + java ) / 4.0;
		
		
		return result;
	}
	// �� ���������� �Ǽ��� �Է�
	public static double mean(double kor,double eng,double math) {
		
		double result = 0;
		result = (kor + eng + math ) / 3.0;
		
		
		return result;
	}
	

}
