
public class �л� {

	public String name;// �̸�
	public String stuNumber;// �й�
	public int grade;// �г�
	public int java; // java ����
	public int web; // web ���� ����
	public int iot; // iot ���� ����

	
public �л� (String name,String stuNumber){
	this.name = name;
	this.stuNumber=stuNumber;
	System.out.println("�л� ��ü ����");
	
}

public void javaScore (int js) {
	
	this.java = js;
	
}

public void webScore (int ws) {
	
	this.web = ws;
	
}

public void iotScore (int is) {
	
	this.iot = is;
	
}

	
	
}
