package 월급계산프로그램;

public class TempEmployee extends Employee {
	
	String empno;
	String name;
	int pay;
	
	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		
		return pay/12;
	}
	
	public void print() {
	System.out.println("사번:"+this.empno+" 이름:"+this.name+" 연봉:"+this.pay);	
	}

}
