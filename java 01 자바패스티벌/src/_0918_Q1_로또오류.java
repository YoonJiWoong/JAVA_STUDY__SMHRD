import java.util.Random;

public class _0918_Q1_로또오류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int array[] = new int[6]; // 로또는 6개 번호 뽑으니깐

		for (int i = 0; i < array.length;) {// int i = 0; i < array.length; i++ 해주면 중간에 i++ 하지말고 중복제거할때 i--만... 
			array[i] = rd.nextInt(45) + 1; // 1~45까지
			
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) { //같은 배열은 어차피 값 같을테니...  array[1]=array[1] 처럼
					i--; // i--해주면 다시 원래값으로 다시 랜덤 추첨
				}
			}
			i++; // 중복 없다면 i가 1 커지고, 아님 원래 i가 됨, i--, i==, i
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("행운의 숫자 :" + array[i]);
		}

	}

}
