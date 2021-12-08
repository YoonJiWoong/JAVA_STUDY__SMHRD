import java.util.Arrays;
import java.util.Scanner;

public class StudentSiumlator11 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student[] stuList = new Student[10]; // 학생 배열 만들기 10명까지 등록 가능, 등록된 학생들의 모음
		int index = 0; // 등록할 학생의 위치
		System.out.println("====SMHRD 성적관리 시스템 ====");

		while (true) {
			System.out.println("[1]학생등록 [2]성적수정 [3]종료");

			int choice = sc.nextInt();

			if (choice == 1) {// 학생 객체 만들어서 등록!

				System.out.print("등록할 학생 이름 >>");
				String name = sc.next();
				System.out.print("등록할 학생 학번 >>");
				String stuNumber = sc.next();

				Student st = new Student(name, stuNumber);
				
				if(index < stuList.length) { // 배열의 길이를 생각해서 <10이라고 안쓰는거임!
					stuList[index++] = st; // 변수 쓰고 바로 ++ 해도 된다. index++
					// 덮어쓰기 -> 덮어쓴다기 보단 사라진다!
				}else {
					System.out.println("더 이상 학생을 등록 할 수 없습니다.");
				}
				
			} else if (choice == 2) {
				System.out.println("수정할 학생 이름 >> ");
				String name = sc.next();//다음에 학생이 있는지 없는지 확인.
				// 해당 학생을 검색(시퀀셜 서치 : 배열의 0번부터 순차적으로 비교)
				int stuIndex = -1; // 찾는 학생의 위치, 학생이 없을 경우를 대비해서 -1
				for(int i =0; i<index; i++) {// index가 학생 등록되면 올라가.. 등록된 학생만큼 검색
					if(name.equals(stuList[i].getName())) { // stuList[i].name 과 비교.. but private 해서 안되!
						// 그래서 이름 돌려주는 메소드를 만들어서 name을 가져온다.
						stuIndex = i;
					}
				}
				if(stuIndex == -1) {
					System.out.println("등록된 학생이 없습니당!~~");
				}else {// 1.한번에 한과목 수정, 2. 한번에 3과목 모두 다 수정할 수 있게!
					
					System.out.println("JAVA 점수 입력");
					int java = sc.nextInt();
					System.out.println("Web 점수 입력");
					int web = sc.nextInt();
					System.out.println("IoT 점수 입력");
					int iot = sc.nextInt();
					
					stuList[stuIndex].changeJava(java);
					stuList[stuIndex].changeWeb(web);
					stuList[stuIndex].changeiot(iot);
					
				
					System.out.println("세 과목 점수"+Arrays.toString(stuList[stuIndex].score(java, web, iot)));
					
				}
				
				
				
				
			} else if (choice == 3) {
				break;
			}
		}
	}
}
