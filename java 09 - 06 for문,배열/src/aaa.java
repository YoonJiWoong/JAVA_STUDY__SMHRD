import java.util.Random;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random(); 
		// ũ�Ⱑ 10�� ������ �迭 ����

		int [] array1 = new int[10];
		
		
		
		// ������ �ڸ��� 0 ~ 19������ ������ ���� ���� �ֱ�

		for (int i = 0; i<array1.length; i++)
		{
		array1[i] = rd.nextInt(20) + 1;
		System.out.print(array1[i] + " ");
		// 4��° �ε��� �� + 9��° �ε��� ��
		// 4��° �ε��� �� ��������
		
		}
		System.out.println("\n 4�� �ε��� �� : " + array1[4]); // 4�� �ε����� ��������
		System.out.println("9�� �ε��� �� : " + array1[9]); // 9�� �ε��� �� ��������
		//     \n ��ĭ ���
		
	
		//  ���� �� ���ϱ�
		
		// ���� ���� ����� ���� total �����
		float total = 0;
		// �ݺ���
		
		for (int i = 0; i<array1.length; i++) {
			total += array1[i];
			//total = array1[i] + total;
			
			}
		System.out.println("�迭�� �ִ� ������ ���� : " +total);
		// �迭�� �ִ� ��� ���� ��� ���ϱ�
		
		System.out.println("�迭�� �ִ� ������ ��� : " + total/array1.length);
	
		
		
		}
		}
		
		
	


