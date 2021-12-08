import java.util.Arrays;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 10명이 들어갈 전화번호부 배열 생성
		
		PersonInfo list[] = new PersonInfo[10];
		System.out.print("이름 입력>>");
		String name = sc.next();
		
		System.out.print("전화 번호 >>");
		String number = sc.next();
		
		System.out.print("생일 입력>>");
		String birth = sc.next();
	
		PersonInfo info = new PersonInfo(name,number,birth);
		
		info.setName(name);
		info.setNumber(number);
		info.setBirth(birth);
		
		
		
//		System.out.println(info.getName()); // name 값 가져오기
//		System.out.println(info.getNumber()); // number 값 가져오기
//		System.out.println(info.getBirth()); // birth 가져오기
		
//		list[0] = info; // 전화번호 데이터 저장
//		
		// 여러분 팀원 전화번호부(list)를 만들어 주세요.
		
		
			System.out.print("이름 입력>>");
			name = sc.next();
			
			System.out.print("전화 번호 >>");
			number = sc.next();
			
			System.out.print("생일 입력>>");
			birth = sc.next();
			
			PersonInfo info2 = new PersonInfo("유선","0101010","05");
			list [1]= info2;
			
			
			for(int i =0; i<list.length; i++) {
				System.out.print("이름 입력>>");
				String name1 = sc.next();
				
				System.out.print("전화 번호 >>");
				String number1 = sc.next();
				
				System.out.print("생일 입력>>");
				String birth1 = sc.next();
				
				PersonInfo info3 = new PersonInfo(name1, number1, birth1);
				list[i] = info;
				
			}
		
			System.out.println("이름출력>>"+list[1].getName());
			System.out.println("번호출력>>"+list[1].getNumber());
			System.out.println("생일출력>>"+list[1].getBirth());
		
		System.out.println(Arrays.toString(list));
		
		
		
		
		
	}

}
