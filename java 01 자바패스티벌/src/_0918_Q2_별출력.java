
// 18�� 2��
import java.util.Scanner;

public class _0918_Q2_����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array[]= new int [5];
		
		for(int i=0; i<array.length;i++) {
		System.out.print(i+"���� ���� �� : ");
		array[i] = sc.nextInt();
		}// �Է��� 0~4�� �ε����� �ִ� �ݺ���
		for(int i=0; i<array.length;i++) {
			System.out.print(i+" : "); // 0~4��° : ���
			for(int j=0; j<array[i]; j++) { // array[i]�� �� ����ŭ �� ��� �ݺ���
				System.out.print("��"); 
			}
			System.out.println();
			
		}
		
		}
		
	}



