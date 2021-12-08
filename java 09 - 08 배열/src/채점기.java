import java.util.Scanner;

public class 채점기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5지 선다
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5]; // 사용자가 입력한 정답이 들어갈 배열
		int[] answer = { 3, 5, 1, 1, 1 };

		// 1. 사용자에게 성답을 입력받는 구간
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		for (int i = 0; i < input.length; i++) {
			System.out.print(1 + i + "번답>>");
			input[i] = sc.nextInt();
		}

		// 2. 입력받은 값과 실제 정답을 비교하는 구간
		for (int i = 0; i < answer.length; i++) { // answer.length[5]-> answer.length[4]로하면 <=아니라<라 오류뜸?
			if (answer[i] == input[i]) {
				System.out.print("O" + " ");
			} else {
				System.out.print("x" + " ");
			}
		}
		// 3. 전체 총점을 출력하는 구간
		int sum = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == input[i]) {
				sum = sum + 20;
			}
		}
		System.out.println("총점 : " + sum);

	}

}
