import java.util.ArrayList;
import java.util.Arrays;

public class PoketMain {

	public static void main(String[] args) {

		// 포켓몬 수는 정확히 알 수 없다.
		// 포켓몬 도감에 몇 마리가 들어가야 하는지 알 수 없다!
		
		
		ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
		Poketmon pika = new Poketmon("피카츄","번개",80,60,70);
		Poketmon piri = new Poketmon("파이리", "불", 90, 40, 50);
		// 5마리 만들기
		Poketmon ko = new Poketmon("꼬북이", "물", 80, 50, 40);
		Poketmon na = new Poketmon("냐옹", "고양이", 50, 70, 60);
		Poketmon lee = new Poketmon("이상해씨", "풀", 90, 90, 30);
		
		
		
		
		//포켓몬 도감 추가
		poktList.add(pika);
		poktList.add(piri);
		// 5마리 만들기
		poktList.add(ko);
		poktList.add(na);
		poktList.add(lee);
		
		System.out.println("피카츄 공격력 : "+poktList.get(0).getAttack());
		
		for(int i=0; i<poktList.size(); i++) {
			
			System.out.print(poktList.get(i).getName()+" ");
			
		}

		
		
		
	}

}
