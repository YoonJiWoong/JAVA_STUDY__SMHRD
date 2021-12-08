import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList01 {

	public static void main(String[] args) {
		
		String [] name = new String[3];
		
		// ArrayList 선언
		ArrayList<String> nameArray = new ArrayList<String>();
		// ArrayList<타입> 변수명 = new ArrayList<타입>
		
		// 값 초기화
		// 배열 첫번째에 값 초기화 
		name[0] = "승환";
		
		// ArrayList 값 추가 // 맨 뒤로 들어간다.
		nameArray.add("승환");
		nameArray.add("유선");
		
		// 값 가져오기
		System.out.println(name[0]);
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		
		//값 삽입
		nameArray.add(1, "대희"); //오버로드 비슷한거   2개 입력하면 됨.. 위치, "입력할꺼"
		System.out.println(nameArray.get(1));
		
		nameArray.add(2, "해도"); 
		System.out.println(nameArray.get(2));
		
		//크기
		System.out.println("일차원 크기"+name.length);
		System.out.println("ArrayList크기 "+nameArray.size());
		
		//삭제
		name[0]=""; // 일반배열 --> 삭제라는 개념은 없고
		// 굳이 하고 싶을땐 빈값으로 초기화는 가능하다! ==> 길이가 정해져있어서
		nameArray.remove(1);
		
		System.out.println(name); // name 이라는 배열이 시작하는 주소값이 출력되는거야!!
		System.out.println(Arrays.toString(name));
		System.out.println(nameArray); // 안에있는 값이 나온다.[승환,해도,유선]
		// ArrayList 기본적으로 toString 기본적으로 포함.
		// ArrayList는 toString을 기본적으로 포함하고 있다!!!!
		
		
		
		
	}

}
