import java.util.Random;

public class 배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int big = 0;
		int [] array1 = new int[10];
		for(int i=0; i<array1.length; i++ )
		{
			array1[i] = rd.nextInt(100);
		}
		for(int i=0; i<array1.length; i++ )
		{
			if(big<array1[i])
			{
			big = array1[i];
			}
			}
		System.out.println("가장 큰 값은 " + big + "입니다.");
	}
}
