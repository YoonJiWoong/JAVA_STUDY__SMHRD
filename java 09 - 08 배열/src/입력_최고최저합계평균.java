import java.util.Scanner;

public class �Է�_�ְ������հ���� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] score = new int[5];
		System.out.print("1��° �Է�>>");
		score[0] = sc.nextInt();
		System.out.print("2��° �Է�>>");
		score[1] = sc.nextInt();
		System.out.print("3��° �Է�>>");
		score[2] = sc.nextInt();
		System.out.print("4��° �Է�>>");
		score[3] = sc.nextInt();
		System.out.print("5��° �Է�>>");
		score[4] = sc.nextInt();
		
		int big = 0;
		int small = 1000;
		int sum= 0;
		
		////////////////////////////////
		int max = score[0]; //0����~
		int min = score[0]; //0����~ �ȵɼ���
		for(int i =0; i<score.length; i++)
		{
			if(max<score[i]) {
				max = score[i];
			}
			if(min>score[i]) {
				min = score[i];
			}
			sum= score[i]+sum;
		}
		System.out.println("�ְ����� :" + max);
		System.out.println("�������� :" + min);
		System.out.println("���� :" + sum);
		System.out.println("��� :" + (double)(sum/score.length)); // �迭�� 0~2 ��� 0 1 2 �� 3���� ������ ���
		// int sum Ȱ�� -> �ݺ��� �������� sum�� ���� ���ϱ�!
		// ����� sum�� �迭�� ���̷� ������!
		
		
		
		
		
		
		System.out.println("*******************************");
		
		//////////////////////////////////////////////////////
		System.out.print("�Էµ� ���� : ");
		for (int i=0; i<score.length; i++)
		{
		System.out.print(score[i] + " ");
		
		if(big<score[i])
		{
		big = score[i];
		}
		if(small>score[i])
		{
		small = score[i];
		}
		{
			sum= score[i]+sum;
		}
	
		}
		System.out.println("\n�ְ����� : " + big);
		System.out.println("�������� : " + small);
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + sum/5); // �迭�� ���̷� ������!
		
	}
		
}
