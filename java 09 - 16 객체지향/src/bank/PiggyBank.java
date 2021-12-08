package bank;




public class PiggyBank {
	//필드
	// 접근제한자 - 필드에도 붙일 수 있어!
	private int money; // 저금된 돈
	
	// 메소드 하나는 단순하게 하나의 역활만 하게 ...
	
	//메소드
	// 1. 돈을 넣는 기능 (deposit)
	// 입력인자 : 정수형 1개 (입력된 돈)
	// 반환타입 : 정수형 1개 (현재 저금통에 들어있는 누적된 금액)
	public int deposit(int input_money) {
		// 스캐너 넣지 않기
		// 출력 넣지 않기
		// 콘솔용? gui?를 또 쓸꺼냐? 의 관점이...
		// 글쓰면 콘솔용에 특화 / 활용도 떨어져.. 호환성 떨어져
		
		
		
		// 필드는 파란색
		// 지역변수 갈색
		
		money += input_money; // money = money+input;
		
		return money;
		// return money
}
	// 2. 돈을 빼는 기능(withDraw)
	// 입력인자 : 정수형 1개(빼고 싶은 금액)
	// 반환타입 : 논리형 1개(출금에 성공하면 true, 실패하면 false)
	
	public boolean withDraw (int out_money) {
		
		
		if(money>=out_money) {
			money -= out_money;
			return true; // 돈이 부족할때는 돈을 못빼니 돈이 많을때만 뺸다.
		}else {
			return false;
		}
		
	}
	// 3. 현재 잔액 확인 기능 (getMoney)
	// 입력인자 : X
	// 반환타입 : 정수형 1개 (현재잔액)
	
	public int getMoney() {
		return money;
	}//입력인자 없이도 만든다.
	
	

		
	}

	
