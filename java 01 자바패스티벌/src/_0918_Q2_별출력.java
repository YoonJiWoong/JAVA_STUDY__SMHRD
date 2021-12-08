
// 18일 2번
import java.util.Scanner;

public class _0918_Q2_별출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array[]= new int [5];
		
		for(int i=0; i<array.length;i++) {
		System.out.print(i+"번쨰 별의 수 : ");
		array[i] = sc.nextInt();
		}// 입력을 0~4번 인덱스에 넣는 반복문
		for(int i=0; i<array.length;i++) {
			System.out.print(i+" : "); // 0~4번째 : 출력
			for(int j=0; j<array[i]; j++) { // array[i]에 들어간 수만큼 별 찍기 반복문
				System.out.print("★"); 
			}
			System.out.println();
			
		}
		
		}
		
	}



