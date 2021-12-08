
public class _0907_Q3_1_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		
		
		
		for (int i = 1; i<=100; i++)
		{
			if(i%2==0) {
				System.out.print(-i+" ");
				num1 = num1 + (-i);
			}else
			{
				System.out.print(+i+" ");
				num1 = num1 + i;
			}
				
				
		}System.out.println();
		System.out.print("°á°ú : "+ num1);
		
	}
}

