import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[5];	
		for(int i =0; i<array.length; i++)
		{
			System.out.print((i+1)+"번째 값 : ");
			array[i] = sc.nextInt();
		}
		
	
		//선택정렬
		for(int i = 0; i<array.length; i++)
		{
			int maxNum = array[i];
			int maxNumIndex = i;
			for(int j = i+1; j<array.length; j++)
			{
				if(maxNum<array[j]) 
				{
					maxNumIndex=j;
					maxNum = array[j]; // 가장 큰 행렬 찾아서 그 값과 인덱스를 넣고
				}
			}
			int temp = array[i];  // i=0 array[0] 저장 
			array[i]=array[maxNumIndex]; // array[0]에 가장 큰 값을 넣고 //찾은 가장 큰 행의 인덱스 값 넣어주고
			array[maxNumIndex]=temp; // 그 가장 큰 값이 있던 배열이 array[0]이 되버림. // 그 큰값있던 것에 기존꺼 채워죠
		}
		// 배열 출력
				System.out.print("배열 출력 : ");
				for (int i=0; i<array.length; i++)
				{
					System.out.print(array[i]+" ");
				}
}
}
