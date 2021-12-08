// 18일 1번
import java.util.Random;

public class _0918_Q1_로또 {

	public static void main(String[] args) {
		Random rd = new Random();
		int array[] = new int[6]; // 로또는 6개 번호 뽑으니깐

		for (int i = 0; i < array.length;i++) {// int i = 0; i < array.length; i++ 해주면 중간에 i++ 하지말고 중복제거할때 i--만... 
			array[i] = rd.nextInt(45) + 1; // 1~45까지
			
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) { //같은 배열은 어차피 값 같을테니...  array[1]=array[1] 처럼
					i--; 
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("행운의 숫자 :" + array[i]);
		}

	}

}
