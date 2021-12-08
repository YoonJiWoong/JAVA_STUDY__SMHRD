import java.util.Random;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random(); 
		// 크기가 10인 정수형 배열 생성

		int [] array1 = new int[10];
		
		
		
		// 각각의 자리에 0 ~ 19사이의 랜덤한 값을 집어 넣기

		for (int i = 0; i<array1.length; i++)
		{
		array1[i] = rd.nextInt(20) + 1;
		System.out.print(array1[i] + " ");
		// 4번째 인덱스 값 + 9번째 인덱스 값
		// 4번째 인덱스 값 가져오기
		
		}
		System.out.println("\n 4번 인덱스 값 : " + array1[4]); // 4번 인덱스값 가져오기
		System.out.println("9번 인덱스 값 : " + array1[9]); // 9번 인덱스 값 가져오기
		//     \n 한칸 띄기
		
	
		//  누적 합 구하기
		
		// 누적 합을 계산할 변수 total 만들기
		float total = 0;
		// 반복문
		
		for (int i = 0; i<array1.length; i++) {
			total += array1[i];
			//total = array1[i] + total;
			
			}
		System.out.println("배열에 있는 값들의 총함 : " +total);
		// 배열에 있는 모든 수의 평균 구하기
		
		System.out.println("배열이 있는 값들의 평균 : " + total/array1.length);
	
		
		
		}
		}
		
		
	


