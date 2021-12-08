import java.util.Scanner;

public class 조건문05_임금계산_정답 {
	
	// 컴퓨터가 너가 일한 시간 입력 이라고 말하면 내가 일한 시간을 입력할게
	// 그럼 너는 그 값을 workTime 이라는 변수에 담아줘
	// 그리고 workTiome 에 담긴 값이 8보다 크다면
	// 8시간 이후로 일한 시간 부터는 5000원에 1.5배인 7500원으로 시급을 계산해줘
	// 그 후에 너는 총 일당을 출력해 주면되!
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("일한시간입력>>");
		int workTime = sc.nextInt();
		
		if(workTime>8) {
			int resultMoney = (int)(8*5000 + (workTime-8)*5000*1.5);
			// 소숫점 int 오류다. 실수형  - (int) 강제 형변환 해주는거
			System.out.println("총 임금 :" + resultMoney);
		}
		else {
			int resultMoney2 = workTime*500;
			System.out.println("총임금 :" +resultMoney2);
		}
	
	}
}
