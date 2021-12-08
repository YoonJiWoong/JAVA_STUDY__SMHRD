import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.print("철수>>");
		String cul = sc.next();	
		System.out.print("영희>>");
		String young = sc.next();
	
		if(cul.equals("가위"))
		{
			if(young.equals("가위"))
			{
				System.out.println("비겼습니다.");
			}else if(young.equals("바위"))
			{
				System.out.println("영희가 이겼습니다");
			}
			else if(young.equals("보"))
			{
				System.out.println("철수가 이겼습니다.");
			}
			
		}
			
		
		
	}

}
