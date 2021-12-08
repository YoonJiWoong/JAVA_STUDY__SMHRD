import java.util.Scanner;

public class _0916_Q2_알파벳쪼개기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("====알파벳 빈도수 구하기====");
		System.out.println("입력 : ");
		String input = sc.nextLine(); // smart (띄어쓰기) Media
		char input_array[] = input.toCharArray(); // 입력한거 쪼개기

		char alphabet[] = Alphabet(97, 122); // 소문자 아스키 코드 97 ~122
		char Alphabet[] = Alphabet(65, 90); // 대문자 아스키 코드 65 ~ 90
		int index[] = new int[26]; // 카운터

		for (int i = 0; i < input_array.length; i++) {
			for (int j = 0; j <= 25; j++) {
				if (input_array[i]== alphabet[j] || input_array[i] == Alphabet[j]) {
					index[j]++;
				}
			
			}
	
		}
		for(int i=0; i<=25;i++) { //출력
			System.out.println(alphabet[i]+ " : "+ index[i]);
		}
		
		
	}

	private static char[] Alphabet(int i, int j) {

		// 알파벳 크기
		char array[] = new char[j-i+1];
		for (int k = i, a = 0; k <= j; k++, a++) {
			array[a] = (char)k;
		}

		return array;
	}
	
	
	
	

}
