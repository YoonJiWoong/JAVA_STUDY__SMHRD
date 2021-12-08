
public class 메소드기초6_CallByReference {

	public static void main(String[] args) {
		
		// callByValue
		// 기본 데이터 타입일때 발생하는 현상
		int number =3;
		print(number);
		System.out.println("메인 넘버 :"+number);
/////////////////////////////////////////////////////////		

	}
	// callByValue
	public static void print(int number) {
		System.out.println(number); //3
		number++; //4
		// 위에 number은 영향 안받아
		// 따로따로 number라는 변수
		// print문 안에 있는 number는 4로 변해
		// 하지만 영향 없쇼
		
		// callByReference
		int [] array = {1,2,3};
		print(array);
		System.out.println("바뀐배열:"+array[0]);
		
		
	}
	
	// 주소라는거 때문에 영향을 줘버려!
	// callByReference
	public static void print(int [] array) {
		// 같은 배열 공유... 주소값을 가르키는 거라서!!
		// 다른 변수... 주소를 저장하는거라서!!
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		array[0] = 10;
		// 영향을 받아버러!! 같은 주소값
		
	}

}
