
public class �޼ҵ����1_�޼ҵ�����_ȣ�� {
	// JDK : �ڹ� ��� ����+�����Ű�� ���� ȯ��(JRE) / JVM : ���� ��������ִ�
	// main �޼ҵ� : ���α׷��� ������(���� ��ų �� �ִ� ����)
	
	public static void main(String[] args) {
		// �޼ҵ� ȣ��(����)
		addNumber(100,900);
		System.out.println("Main ��");
		// �޼ҵ� ȣ��(����)
		subThreeNumber(3.5f,1.2f,0.4f);
		// double �ƴ϶� float Ÿ�ԽἭ �ڿ� f�� �ٿ�����. �ȱ׷� ���� ����!
		
	}
	// ��Ʈ�� x : �����α�
	
	// addNumber �޼ҵ�
	// �޼ҵ� ����
	public static void addNumber(int num1, int num2) { 
		//public static void �޼ҵ��() // ():�Ű�����
		
		int result = num1 + num2;
		System.out.println(result);
		
	}
	// subNumber �޼ҵ� : 3���� �Ǽ��� �Է¹޾Ƽ� ����
	public static void subThreeNumber(float n1,float n2,float n3) {
		float result = n1 - n2 - n3;
		// if) int result = ~~ ���. �׷� �������� �޶� ��������!
		System.out.println(result);
	}
	
	
}
