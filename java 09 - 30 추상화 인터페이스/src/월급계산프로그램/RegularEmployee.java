package 월급계산프로그램;

public class RegularEmployee extends Employee {
	
	String empno; // 사번
	String name; // 이름
	int pay; // 연봉
	int bonus; // 보너스
	
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	// 월 급여 계산 메소드
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	// 사번,이름,연봉 출력
	public void print() {
		System.out.println("사번:"+this.empno+" 이름:"+this.name+" 연봉"+this.pay);
	}
	
	
}
