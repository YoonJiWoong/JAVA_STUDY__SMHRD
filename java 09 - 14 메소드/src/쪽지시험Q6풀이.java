import java.util.Scanner;

public class 쪽지시험Q6풀이 {
	public static void main(String[] args) {

		// sequential search

		String[] f = { "사과", "키위", "레몬", "자몽", "깔라만시", "복숭아" };

		Scanner sc = new Scanner(System.in);
		System.out.print("찾고싶은 과일 : ");
		String input = sc.next();

		int findIndex = -1;
		for (int i = 0; i < f.length; i++) {
			if (input.equals(f[i])) {

				findIndex = i;
				break; // 찾아서 멈추는거 까지!!
			}
		}
		if (findIndex == -1) {
			System.out.println("찾는 과일이 없습니다");
		}else {
			System.out.println(input+"의 위치는"+(findIndex+1)+"번째입니다.");
		}
		// 인덱스 넘버 활용하기!!
	}
}
