import java.util.Scanner;

public class 쪼개기 {

	public static void main(String[] args) {
		// array[i]는 97과 122사이라면, 65 ~ 90
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>>");
		String input = sc.nextLine();
		
		char array_input[] = input.toCharArray();
		int array_count[]= new int[26];
		char array_apb[]=Alphabet(97, 122);
		char array_APB[]=Alphabet(65, 90);
		
		for(int i=0; i<array_input.length; i++) {
			
			for(int j=0; j<=25; j++) {
				if(array_input[i]==array_apb[j]||array_input[i]==array_APB[j]) {
					array_count[j]++;
				}
				
			}
			
		}
		
		
		for(int i=0; i<=25;i++) {
			
			System.out.println((char)(i+97)+" : "+array_count[i]);
			
			
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
