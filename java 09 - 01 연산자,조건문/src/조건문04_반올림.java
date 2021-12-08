import java.util.Scanner;

public class 조건문04_반올림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력:");
		int number = sc.nextInt();
		
		int oneJali = number %10; 
		if(oneJali>=5) { // 10으로 나눴을때 나머지가 5보다 크냐? 작냐?에 따라 반올림
			number = (number-oneJali)+10; // 반올림, 원래 숫자에 나머지를 빼고 +10
		}
		else {
			number = number-oneJali; // 반올림, 원래 숫자에 그냥 나머지만 빼고
		}
		System.out.println("반올림 수" + number);
		//if(number % 10 >= 5) {
			//System.out.println("반올림 수" + (number - number % 10 +10));
		
		//else {
			//System.out.println("반올림 수" + (number - number % 10 ));
		
			
	}
}