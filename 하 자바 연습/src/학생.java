
public class 학생 {

	public String name;// 이름
	public String stuNumber;// 학번
	public int grade;// 학년
	public int java; // java 과목
	public int web; // web 과목 점수
	public int iot; // iot 과목 점수

	
public 학생 (String name,String stuNumber){
	this.name = name;
	this.stuNumber=stuNumber;
	System.out.println("학생 객체 생성");
	
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
