import java.util.Scanner;

public class _0921_Q2_채점하기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("====채점하기====");
		String ox = sc.next();
		String arrayOx[] = ox.split("");
		// System.out.println(Arrays.toString(arrayOx)); // 제대로 배열 쪼개졌는지?
		int sum = 0;
		int j = 1;
		for (int i = 0; i < arrayOx.length; i++) {
			if (arrayOx[i].equals("o")) { //  eqyals ("")
				sum += j;
				j++;
			} else {
				j = 1;
			}

		}
		System.out.println("합계 : "+sum);

	
		
		
	}

}
