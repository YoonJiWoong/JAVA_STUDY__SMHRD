
public class �޼ҵ����2_�޼ҵ������ {
		// public static int main(String[] args) ������ ������ ���� �Ⱦ���.
	public static void main(String[] args) {
		// ���� 1���� �Է��ϸ� 10�� �ڸ� ���ϴ� �����ϴ� �޼ҵ�
		// 444 -> 400
		// 111 -> 100
		
		// �޼ҵ� ȣ��
		String rs1 = kill10(444);
		String rs2 = kill10(111);
		System.out.println("rs1 : "+ rs1);
		System.out.println("rs2 : "+rs2);
	}
	// �޼ҵ� ���� / ���ʿ� ���ϵǴ� �ڷ����� ���ؼ�... ���ʿ� ���� �̾߱��ؼ� ���� ����
	public static String kill10(int num) {
		// ������ �Է��ؼ� �����ϸ� ���ڿ��� ���´�.
		 String result = (num / 100) + "00";
		// int result1 = num-num%100;
		//System.out.println(result1);
		 return result;
		// �ƹ��͵� �ȳ����� void
	}

}
