import java.util.Random;

public class _0910_Q3_������ū��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[8];
		Random rd = new Random();
		for(int i =0; i<array.length; i++)
		{
			array[i] = rd.nextInt(100)+1;
			System.out.print(array[i]+"\t");
		}
		int max = array[0];
		int min = array[0];
		for(int i =0; i<array.length; i++)
		{
			if(max<array[i])
			{
				max=array[i];
		}
			else if(min>array[i])
			{
				min=array[i];
			}
		}
		System.out.print("\n���� ū �� : "+max);
		System.out.print("\n���� ������: "+min);
		
	}

}
