
public class 별찍기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *
		// **
		// ***
		// ****
		// *****
		// 리팩토링 기법? -일단 짜고, 구조를 개선해서, 최적화하기
		for (int num = 1; num <= 7; num++) {

			for (int i = 0; i <= 5; i++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
}
		
		
		
//			for (int i=0; i<1; i++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		for (int i=0; i<2; i++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i=0; i<3; i++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i=0; i<4; i++)
//		{
//		System.out.print("*");
//		}
//		System.out.println();
//			
//		for (int i=0; i<5; i++)
//		{
//		System.out.print("*");
//		}
//		System.out.println();
//		}

