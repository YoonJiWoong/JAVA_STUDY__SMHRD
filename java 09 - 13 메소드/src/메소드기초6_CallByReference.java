
public class �޼ҵ����6_CallByReference {

	public static void main(String[] args) {
		
		// callByValue
		// �⺻ ������ Ÿ���϶� �߻��ϴ� ����
		int number =3;
		print(number);
		System.out.println("���� �ѹ� :"+number);
/////////////////////////////////////////////////////////		

	}
	// callByValue
	public static void print(int number) {
		System.out.println(number); //3
		number++; //4
		// ���� number�� ���� �ȹ޾�
		// ���ε��� number��� ����
		// print�� �ȿ� �ִ� number�� 4�� ����
		// ������ ���� ����
		
		// callByReference
		int [] array = {1,2,3};
		print(array);
		System.out.println("�ٲ�迭:"+array[0]);
		
		
	}
	
	// �ּҶ�°� ������ ������ �����!
	// callByReference
	public static void print(int [] array) {
		// ���� �迭 ����... �ּҰ��� ����Ű�� �Ŷ�!!
		// �ٸ� ����... �ּҸ� �����ϴ°Ŷ�!!
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		array[0] = 10;
		// ������ �޾ƹ���!! ���� �ּҰ�
		
	}

}
