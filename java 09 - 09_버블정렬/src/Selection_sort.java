import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[5];	
		for(int i =0; i<array.length; i++)
		{
			System.out.print((i+1)+"��° �� : ");
			array[i] = sc.nextInt();
		}
		
	
		//��������
		for(int i = 0; i<array.length; i++)
		{
			int maxNum = array[i];
			int maxNumIndex = i;
			for(int j = i+1; j<array.length; j++)
			{
				if(maxNum<array[j]) 
				{
					maxNumIndex=j;
					maxNum = array[j]; // ���� ū ��� ã�Ƽ� �� ���� �ε����� �ְ�
				}
			}
			int temp = array[i];  // i=0 array[0] ���� 
			array[i]=array[maxNumIndex]; // array[0]�� ���� ū ���� �ְ� //ã�� ���� ū ���� �ε��� �� �־��ְ�
			array[maxNumIndex]=temp; // �� ���� ū ���� �ִ� �迭�� array[0]�� �ǹ���. // �� ū���ִ� �Ϳ� ������ ä����
		}
		// �迭 ���
				System.out.print("�迭 ��� : ");
				for (int i=0; i<array.length; i++)
				{
					System.out.print(array[i]+" ");
				}
}
}
