import java.util.Scanner;

public class �������迭06_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] answer = {{4,5,4,1,2}, // ���ִ���
						{0,0,0,0,0},
						{10,20,30,20,20}}; // �� ������ ���� ������
		// ������ �迭�� �� �ִ� ���!
		// ���ڿ� :{"","","","","" } / ������{0,0,0,0,0}
		// int [] num = new int[3];
		// System.out.println(num[1]); - 0���� ��µ�!
		// ���� ���� �ʴ´ٴ� ������ 0���� ���� �ʱ�ȭ
		for(int i=0; i<answer[1].length; i++)
		{
			System.out.print(i+1+"��° ��>>");
			answer[1][i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<answer[1].length; i++) //01234
		{
			if (answer[0][i] == answer[1][i]) 
			{
				System.out.print("0" + "\t");
				sum = sum + answer[2][i]; // answer[3][i]��� �Ǽ���.
			}

			else {
				System.out.print("x" + " \t");
			}
			
		}System.out.println("\n���� : " + sum );
			
	}

}
