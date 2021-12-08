import java.util.Scanner;

public class 초시간계산_정답 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 :");
		int totalSecond =  sc.nextInt();
		int h = totalSecond / 3600; // 시간은 1시간에 3600초라서 그냥 나눈다.
		int m = totalSecond % 3600 / 60; // 분은 원래에 3600(시간)으로 나눈 나머지를 다시 60(분)으로 나눠줌
		int s = totalSecond % 3600 % 60;//  초는 원래에 3600(시간)으로 나눈 나머지에 다시 60(분)으로 나눈 나머지다.
		System.out.println(h + "시" + m + "분" + s + "초");
	}

}
