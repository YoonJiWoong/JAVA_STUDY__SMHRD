package ���ް�����α׷�;

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
	System.out.println("���:"+this.empno+" �̸�:"+this.name+" ����:"+this.pay);	
	}

}
