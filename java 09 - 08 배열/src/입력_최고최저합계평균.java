import java.util.Scanner;

public class 입력_최고최저합계평균 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] score = new int[5];
		System.out.print("1번째 입력>>");
		score[0] = sc.nextInt();
		System.out.print("2번째 입력>>");
		score[1] = sc.nextInt();
		System.out.print("3번째 입력>>");
		score[2] = sc.nextInt();
		System.out.print("4번째 입력>>");
		score[3] = sc.nextInt();
		System.out.print("5번째 입력>>");
		score[4] = sc.nextInt();
		
		int big = 0;
		int small = 1000;
		int sum= 0;
		
		////////////////////////////////
		int max = score[0]; //0보다~
		int min = score[0]; //0보다~ 안될수도
		for(int i =0; i<score.length; i++)
		{
			if(max<score[i]) {
				max = score[i];
			}
			if(min>score[i]) {
				min = score[i];
			}
			sum= score[i]+sum;
		}
		System.out.println("최고점수 :" + max);
		System.out.println("최저점수 :" + min);
		System.out.println("총합 :" + sum);
		System.out.println("평균 :" + (double)(sum/score.length)); // 배열은 0~2 라면 0 1 2 즉 3개를 나눠야 평균
		// int sum 활용 -> 반복문 돌떄마다 sum에 값을 더하기!
		// 평균은 sum을 배열의 길이로 나누기!
		
		
		
		
		
		
		System.out.println("*******************************");
		
		//////////////////////////////////////////////////////
		System.out.print("입력된 숫자 : ");
		for (int i=0; i<score.length; i++)
		{
		System.out.print(score[i] + " ");
		
		if(big<score[i])
		{
		big = score[i];
		}
		if(small>score[i])
		{
		small = score[i];
		}
		{
			sum= score[i]+sum;
		}
	
		}
		System.out.println("\n최고점수 : " + big);
		System.out.println("최저점수 : " + small);
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + sum/5); // 배열의 길이로 나눠요!
		
	}
		
}
