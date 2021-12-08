import java.util.Scanner;

public class 이차원배열06_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] answer = {{4,5,4,1,2}, // 답있는행
						{0,0,0,0,0},
						{10,20,30,20,20}}; // 각 문제에 대한 배점행
		// 이차원 배열에 값 넣는 방법!
		// 문자열 :{"","","","","" } / 정수형{0,0,0,0,0}
		// int [] num = new int[3];
		// System.out.println(num[1]); - 0으로 출력됨!
		// 값을 넣지 않는다는 뜻으로 0으로 보통 초기화
		for(int i=0; i<answer[1].length; i++)
		{
			System.out.print(i+1+"번째 답>>");
			answer[1][i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<answer[1].length; i++) //01234
		{
			if (answer[0][i] == answer[1][i]) 
			{
				System.out.print("0" + "\t");
				sum = sum + answer[2][i]; // answer[3][i]라고 실수함.
			}

			else {
				System.out.print("x" + " \t");
			}
			
		}System.out.println("\n총합 : " + sum );
			
	}

}
