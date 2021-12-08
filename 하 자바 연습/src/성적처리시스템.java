import java.util.Scanner;

public class 성적처리시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 학생생성

		// 학생 배열 만들기 10명까지 등록 가능, 등록된 학생들의 모음
		// [1]학생등록 [2]성적수정 [3]종료"

		Scanner sc = new Scanner(System.in);
		학생 array[] = new 학생[2];

		System.out.println("====성적관리====");

		int index = 0;
		while (true) {
			System.out.print("[1]학생등록 [2]성적수정 [3]종료 [4]성적확인");
			int input = sc.nextInt();

			if (input == 1) {
				System.out.print("학생 이름을 적어주세요");
				String name = sc.next();
				System.out.print("학번을 적어주세요");
				String stuNumber = sc.next();

				학생 a = new 학생(name, stuNumber);

				if (index < array.length) {

					array[index++] = a;
				} else {
					System.out.println("등록불가");
				}

			} else if (input == 2) {

				
				System.out.print("학생 이름을 적어주세요");
				String name = sc.next();
				System.out.print("학번을 적어주세요");
				String stuNumber = sc.next();
				
				for (int i = 0; i < index; i++)	 { // index 말고 길이로 했을때 null값 있는건?
				 
					 if (array[i].name.equals(name) && array[i].stuNumber.equals(stuNumber))
					 {
						 while(true) {
							 
							 System.out.println("수정할 과목 [1]자바 [2]web [3]iot [4]나가기");
							 
							 int input1 = sc.nextInt();
							 if (input1 == 1) {
								 System.out.print("점수입력");
								 int score = sc.nextInt();
								 array[i].javaScore(score);
							 } else if (input1 == 2) {
								 System.out.print("점수 입력하세요");
								 int score = sc.nextInt();
								 array[i].webScore(score);
							 } else if (input1 == 3) {
								 System.out.print("점수 입력하세요");
								 int score = sc.nextInt();
								 array[i].iotScore(score);
							 }else if(input1 == 4) {
								 break;
							 }else {
								System.out.println("입력확인");
							 }
							 
							 
						 }
						
						
					}else {
						System.out.println("입력 다시 확인해주세요");
						break;
					}
				
				}
				

			} else if (input == 3) {
				System.out.println("종료");
				break;
			} else if (input == 4) {
				System.out.println("학생 이름을 적어주세요");
				String name = sc.next();
				System.out.println("학번을 적어주세요");
				String stuNumber = sc.next();
				

				for (int i = 0; i < index; i++) {
					if (array[i].name.equals(name) && array[i].stuNumber.equals(stuNumber)) {

						System.out.println("자바 :" + array[i].java + " iot :" + array[i].iot + " web :" + array[i].web);
						break;
					}
					
				}

			}

			else {
				System.out.println("다시 입력해주세요");
			}

		}

	}

}
