public interface KartRider {
	//�������̽� ��� ������ �������(���赵)
	
	//ī��(��)����!
	
	//1.�������̽��� ������ �ƴ� ����� ���� ���� �� �ִ�!! == final!
	//��� ==> ������ �ʴ� ���̴�!! ������ ��!!!
	final int position =0; //������ġ�� �������ִ� �ʵ�
	// position = 45; �̷��� �ȵȴ�!
	// final String name = "��ȯ"; ��Ʈ���� �ȴ�
	
	//�߻�޼ҵ� ����
	
	//������ ���� �޼ҵ�
	public abstract void go(int num);
	
	//�ڷ� ���� �޼ҵ�
	public abstract void back(int num);
	
	//�ν��� �޼ҵ�
	public abstract void buster(int num);
	
	//�������̽��� ���赵! �̴� ����� ���������ʰ� ���� ���ش�!
	//�ϴ� �̷� ����� ������ ���� ��ü���� ����� ���߿� �����ž�?
}

