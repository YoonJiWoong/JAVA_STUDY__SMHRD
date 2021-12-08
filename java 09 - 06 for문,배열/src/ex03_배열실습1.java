import java.util.Random;

public class ex03_배열실습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 생성한 배열에 값 출력하기
		Random rd = new Random(); 
		// 크기가 10인 정수형 배열 생성

		int [] array1 = new int[10];
		
		array1[1] = 023;
		
		// 각각의 자리에 0 ~ 19사이의 랜덤한 값을 집어 넣기

		for (int i = 0; i<array1.length; i++)
		{
		array1[i] = rd.nextInt(20) + 1;
		System.out.print("배열의값 :" + array1[i] + " ");
		
		
		}
	
	}

}
