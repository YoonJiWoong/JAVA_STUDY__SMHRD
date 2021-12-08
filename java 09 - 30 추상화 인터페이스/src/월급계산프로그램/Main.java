package 월급계산프로그램;
public class Main {

	public static void main(String[] args) {

		
// RegularEmployee 객체 생성
		RegularEmployee regular = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
//		regular.print();
//		System.out.println(regular.getMoneyPay() + "만원");

		System.out.println(regular.getMoneyPay());
		regular.print();
		
		Employee ep = regular; //추상, 업캐스팅
		System.out.println(ep.getMoneyPay()); 
	
		ep.print();
		
	}

}
