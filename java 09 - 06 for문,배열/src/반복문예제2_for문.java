
public class �ݺ�������2_for�� {

	public static void main(String[] args) {
		// 1~20���� ���ڸ� ����غ���
		// Ȧ���� ����� ����� �ϰ�, ¦���� ������ ����غ��ʴ�.
//		for (int i = 1; i <= 20; i++)
//			if (i%2== 0) { //¦��
//				System.out.print(-i+" ");
//			} else { //Ȧ��
//				System.out.print(i+" ");
//			}
//		
//		System.out.println();
//		
//		for (int i = 1; i<=20;)
//		{
//			System.out.print(" "+i+" ");
//			i++;
//			
//			System.out.print("-"+i+" ");
//			i++;
//		}
		
		for(int even=2, odd=1; even<=20; even+=2, odd+=2){
			System.out.print(odd+" "+ -even + " ");
			// even �ϳ��� �����ص� �����ϴ�  even<=20 && odd<=19
			
			
		}
	}

}
