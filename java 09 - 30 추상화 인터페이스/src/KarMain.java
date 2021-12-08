import java.util.Scanner;

public class KarMain {

	public static void main(String[] args) {
		
		SngKar kar = new SngKar();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("전진값 >>");
		int num = sc.nextInt();
		kar.go(num);
		System.out.println("현재위치>>"+kar.sngkarPosition);
		kar.parking();
		//후진값
		//부스터값
		
		//최종 차의 위치를 알려주는 프로그램!
		
	}

}
