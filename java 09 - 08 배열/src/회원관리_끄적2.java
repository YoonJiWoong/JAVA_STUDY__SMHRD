import java.util.Scanner;

public class 회원관리_끄적2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// 1.회원가입 2.로그인 3.종료

		Scanner sc = new Scanner(System.in);

		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		String id;
		String pw;

		System.out.println("==== 회원관리 시스템 ====");

		
			int i=0;
			while (true) {
				System.out.println("1.회원가입 2.로그인 3.종료");
				int choice = sc.nextInt();

				if (choice == 1) // 회원가입
				{
					System.out.println("==== 회원가입 ====");

					System.out.print("ID입력 : ");
					id_array[i] = sc.next();
					System.out.print("PW입력 : ");
					pw_array[i] = sc.next();
					System.out.println("가입성공");
					i = i + 1;
				}

				else if (choice == 2) // 로그인
				{
					System.out.println("==== 로그인 ====");
					System.out.print("ID입력 : ");
					id = sc.next();
					System.out.print("PW입력 : ");
					pw = sc.next();

					int count = 0;
					for(int j=0; j<id_array.length; j++)
					{
						if(id.equals(id_array[j]) && pw.equals(pw_array[j]))
								{
							System.out.println("로그인 성공");
								}
							count++;
						
					} if(count ==0) {
						System.out.println("로그인 실패");
					
					
					}
				}

				else if (choice == 3) // 프로그램 종료
				{
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					System.out.println("번호를 올바르게 입력하세요!!");
				}

			}
		
	

	}

}
