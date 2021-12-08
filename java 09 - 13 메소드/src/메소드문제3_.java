
public class 메소드문제3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,3,4,8,7,9,10};
		arrayToString(array);
		
		
	}

//	public static void arrayToString(int array[]) {
//		
//		System.out.print(array[0]+" ");
//		System.out.print(array[1]+" ");
//		System.out.print(array[2]+" ");
//		System.out.print(array[3]+" ");
//		System.out.print(array[4]+" ");
//		System.out.print(array[5]+" ");
//		System.out.print(array[6]+" ");

	public static void arrayToString(int [] array) {
		//int [] array랑int array[] 같다
		for(int i=0; i< array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}
