package bank;

public class Main {

	public static void main(String[] args) {
		// 돼지 저금통 생성 (object)
		// 클래스명 변수명 = new 클래스명();
		PiggyBank p1 = new PiggyBank();
		
		PiggyBank p2 = new PiggyBank();
		
		int result_p1 = p1.deposit(5000);
		System.out.println("p1 현재 누적된 금액 :" + result_p1);
		result_p1 = p1.deposit(1000);
		System.out.println("p1 현재 누적된 금액 :" + result_p1);
		
		int result_p2 = p2.deposit(9000);
		System.out.println("p2 현재 누적된금액"+ result_p2);
		
		boolean isSuccess = p2.withDraw(5000);
		if(isSuccess) {
			System.out.println("출금성공");
		}else {
			System.out.println("출금실패");
		}
		
		int result = p1.getMoney();
		System.out.println("p1의 현재금액 :"+result);
		int money = p2.getMoney();
		System.out.println("p2 현재잔액 :"+ money);
		
		// 클래스의 필드를 만들때는 일반적으로 private을 붙여서
		// 데이터를 보호하자!!, 허용된 메소드로 접근을 할 수 있게해야 컨트롤이 가능해진다.
		
		// p1.money = -1000; // 바뀌어버려.... 데이터는 보호 될 수 있도록!
							// private 붙여서 허용된 메소드에서만 사용하게끔...
	}

}
