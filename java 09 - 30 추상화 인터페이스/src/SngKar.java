
public class SngKar implements KartRider, KartRider2 {
	
	int sngkarPosition = position;
	
	//�޼ҵ� �̸� ������ �Ű����� �ٸ��� �����ε� �Ǽ� ����?
	
	@Override // ������̼� - ��ø��س�Ŷ� ������ �������
	public void go(int num) {
		sngkarPosition +=num;
		
	}

	@Override
	public void back(int num) {
		sngkarPosition -=num;
		
	}

	@Override
	public void buster(int num) {
		sngkarPosition *=num;
		
	}
	//Ŭ������ ��ӹ������� extends
	//�������̽��� �����Ҷ��� implements : ���,���� ����� ����.

	@Override
	public void parking() {
		System.out.println("����");
		
	}
}
