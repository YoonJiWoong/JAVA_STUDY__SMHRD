
public class PersonInfo {

	// �̸�
	private String name;
	// ��ȭ��ȣ
	private String number;
	// ����
	private String birth;
	
	
	// ������ ����/�������� ���ؼ�
	// get, set Ȱ��
	
	public String getName() { // �ҷ�����?
		return name;
	}
	public void setName(String name) { // �����ϱ�?
		this.name = name; // this -> �򰥸��ϱ� ����~ ���� �Ķ��۾� name
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) { 
		this.number = number;
	}
	public String getBirth() { 
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public PersonInfo(String name, String number, String birth) {
	//	super();  ���߿� �������ֽ�. Ŭ�������� ���� ���谡 �ִµ�.. �ڱ⺸�� �� �����Ѷ�
		this.name = name;
		this.number = number;
		this.birth = birth;
	}
	// setter, getter ���߿� �� �ٲܶ�! �׶� �׶� ����~!
	
	
	
	
	
	
}
