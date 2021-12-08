import java.util.ArrayList;
import java.util.Scanner;

public class 포켓몬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Poketmon poket1 = new Poketmon("pika", "sunder", 10, 10, 10);
		Poketmon poket2 = new Poketmon("piri", "fire", 20, 30, 5);

		ArrayList<Poketmon> pokectList = new ArrayList<Poketmon>();

		// 포켓몬 도감 만들기 (포켓몬 추가)
		pokectList.add(poket1);
		pokectList.add(poket2);

		// 포켓몬 리스트 출력
		System.out.println("===포켓몬 리스트 출력===");
		for (int i = 0; i < pokectList.size(); i++) {
			String name = pokectList.get(i).getName();
			System.out.println((i + 1) + "." + name);
		}

		// 두마리 포켓몬 선택
		System.out.print("첫번째 포켓몬 번호입력>>");
		int num1 = sc.nextInt();

		System.out.print("두번째 포켓몬 번호입력>>");
		int num2 = sc.nextInt();

		// 앞에서 입력받은 번호를 인덱스로 활용하여 공격력 가져오기
		int attack1 = pokectList.get(num1 - 1).getAttack();
		int attack2 = pokectList.get(num2 - 1).getAttack();

		if (attack1 > attack2) {
			System.out.println(pokectList.get(num1 - 1).getName() + "이 이겼습니다");
		} else if (attack2 > attack1) {
			System.out.println(pokectList.get(num2 - 1).getName() + "이 이겼습니다");
		} else {
			System.out.println("무승부 입니다.");
		}

	}

}
