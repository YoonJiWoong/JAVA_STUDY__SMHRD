import java.util.Scanner;

public class _0916_Q2_알파벳쪼개기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("====알파벳 빈도수 구하기====");

		System.out.print("입력>> ");

		String str = sc.nextLine();
		// sc.nextLine() : 줄 단위로 값을 구분
		// sc.next() : 띄어쓰기로 값을 구분한다면,
		char[] array = str.toCharArray(); // 입력받은 알파켓을 char[]로 바꿔준다.
		// toCharArray : String 을 char[] 로 바꿔주는 기능
		int result[] = new int[26];

		char bigEng[] = new char[26];
		// 대문자 넣기
		for (int i = 0, j = 'A'; j <= 'Z'; i++, j++) {

			bigEng[i] = (char) (j);

		}
		// 소문자 넣기
		char smallEng[] = new char[26];

		for (int i = 0, j = 'a'; j <= 'z'; i++, j++) {

			smallEng[i] = (char) (j);

		}

		for (int i = 0; i < array.length; i++) { // i는 입력받은 알파벳의 길이만큼

			if (array[i] >= 97 && array[i] <= 122) { // array[i]는 97과 122사이라면, 아스키코드 소문자

				for (int j = 0; j < smallEng.length; j++) {

					if (array[i] == smallEng[j]) { // 소문자를 담은 배열에 들어있는 알파벳과 입력한 알파벳을 담은 배열이 일치하면

						result[j]++; // result 배열의 인덱스 j번째의 수를 1을 올린다.
										// 초기값은 0 이니... 암것도 선언 안하면.
					}

				}

			}
			// 소문자와 일치하지 않는다면 대문자와 비교
			else if (array[i] >= 65 || array[i] <= 90) { // array[i]는 65과 90사이라면, 아스키코드 대문자
				// && 아닌감? 어차피 or이여도 for 들어가서 result가 커지면 상관없으니?
				for (int j = 0; j < bigEng.length; j++) {

					if (array[i] == bigEng[j]) { // 대문자를 담은 배열에 들어있는 알파벳과 입력한 알파벳을 담은 밸열 일치

						result[j]++; // result 배열의 인덱스 j번째의 수를 1을 올린다.

					}

				}

			}

		}

		for (int i = 0; i < result.length; i++) {

			System.out.println(smallEng[i] + " : " + result[i]);
			// 반복문 이용 소문자 배열의 알파벳들을 배열 : 카운터 된 조건문!
		}

	}

}
