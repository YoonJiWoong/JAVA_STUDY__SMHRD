import java.util.Arrays;
import java.util.Random;

public class 랜덤큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[8];
		
		Random rd = new Random();
		for(int i=0; i<array.length; i++) {
			array[i]= rd.nextInt(8)+1;
			for(int j=0; j<i; j++) {
				if(array[i]==array[j]) {
					i--;
				}
				
			}
		}
		System.out.print("배열의 모든값"+ Arrays.toString(array));
		
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[j];
					array[j]=array[i];
					array[i]=temp;
				}
				
			}
			
		}
		System.out.println("가장 작은수 : "+array[0]+"\n 가장 큰 수 :"+array[array.length-1] );
		
		
		
	}

}
