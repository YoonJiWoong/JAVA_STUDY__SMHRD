
public class ex02_배열생성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언, 생성, 값 집어넣기를 한번에 진행해보자!
		
		// 배열 생성할때 배열에 들어갈 값을 알고 있는 경우
		// ex> 1반 : 30 2반 : 25 3반 : 28
		int[] array1 = { 10, 20, 30, 40 };
		
		
		// 각 학생의 개인 정보를 담으려고 할때
		// 이름 나이 성별 주소 혈액형
		// 배열을 생성할 당시에 배열에 들어갈 값이 모호한 경우
		// int [] array1 = new int[5];

		// 배열의 크기 출력
		System.out.println("배열의크기 : " + array1.length);
		// 배열 안에 있는 값 출력
		System.out.println("배열 값 불러오기 : ");
		for (int i = 0; i < array1.length; i++) { // i =4 /array1[4] 오류!
			System.out.print("배열의값 : "+array1[i] + " ");
		}
	}
}
