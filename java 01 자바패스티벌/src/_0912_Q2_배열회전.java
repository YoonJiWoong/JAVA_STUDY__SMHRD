
public class _0912_Q2_배열회전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		// TODO Auto-generated method stub
		

			// TODO Auto-generated method stub
			int [][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
			System.out.println("원본");
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
		}
			// 04 14 24 34 44
			// 03 13 23 33 43
			// 02 12 22 32 42
			// 01 02 03 04 05
			System.out.println("90도 회전");
			for(int j = array.length-1 ; j>= 0; j--)
			{
				for(int i =0; i<array.length; i++)
				{
					System.out.print(array[i][j]+"\t");
				}System.out.println();
			}
			
		
	}

}
