import java.util.Scanner;

public class _0904_Q1_�ݿø� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����Է� :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%10 > 5) {
			num = (num/10+1)*10;
		}
		else {
			num = num/10*10;
		}
		System.out.println("�ݿø� ��"+num);
	}

}
