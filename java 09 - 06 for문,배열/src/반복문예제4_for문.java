
public class 반복문예제4_for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int num = 1; num <= 9; num++) {
			
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + num + "=" + (dan * num) + "\t");
				
			}
			System.out.println(); // 줄바꿈 아래?
		}
	}
}
