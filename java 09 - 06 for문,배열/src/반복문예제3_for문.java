
public class 반복문예제3_for문 {

	public static void main(String[] args) {
		// 2단 : 2*1=2 2*2=4 ... 2*9=18
		// 2단,3단....9단 반복
		// 2단 만드는 for문 만들고
		// 이후 2단,3단,4단 등으로 만드는 for문 만들고

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println();
			System.out.print(dan + "단 : ");
			for (int num = 1; num <= 9; num++) { //9번 반복
				System.out.print(dan + "*" + num + "=" + dan * num + " ");
			}

		}

	}

}

