
public class ���ڿ� {

	public static void main(String[] args) {
		// Java���� ���ڿ��� ǥ���ϴ� ������ Ÿ�� String(����� ���� Ÿ��)
		
		char c = 'A'; //���� �ϳ� '' ��  ""=> String���� �ν�
		String s = "A";
		
		char[] word_array = new char[5];
		word_array[0] = 'A';
		word_array[1] = 'p';
		word_array[2] = 'p';
		word_array[3] = 'l';
		word_array[4] = 'e';
		
		//Strig Ÿ���� ������ ���
		
		String word = "Apple"; // ���ο��� char �迭�� �����Ǿ��ִ�.
		// 1. ���ڿ����� Ư�� ��ġ�� �� ���ڸ� �����Ҷ� ���
		char result =word.charAt(0); //Ư�� ��ġ�� ���� ����
		System.out.println(result);
		
		// 2. ���ڿ��� Ư�� ��ȣ�� �ɰ��� ������ ���: split
		String wordList = "�ٳ���,���,��,����";
		String[] wordListSplit = wordList.split(","); //�ɰ��� ���� ��ȣ
		//���ڿ� �迭 Ÿ��
		System.out.println(wordListSplit[0]);
		System.out.println(wordListSplit[1]);
		System.out.println(wordListSplit[2]);
		System.out.println(wordListSplit[3]);
		
		
		String msg = "�ȳ��ϼ���. ���ɽð��Դϴ�. ����Ŀ�.";
		// 3. Ư�� ���ڰ� ���ڿ��� ���ԵǾ� �ִ��� �˾ƺ��� ��� : contains 
		boolean result2 = msg.contains("����");
		System.out.println(result2);
		
		// 4. ���ڿ��� Ư�� ���ڸ� �ٸ� ���ڷ� ��ü�ϴ� ��� : replace
		String result3 = msg.replace("����Ŀ�", "�����");
		System.out.println(result3);
		// �ٲܴܾ� , �ٲܴܾ��
		
		// 5. ���ڿ� �Ϻ� ������ �߶󳻴� ��� : substring
		String result4 = msg.substring(1,4);
		// 0~5 ��°���� : 0 1 2 3 4 5
		System.out.println(result4);
		
		
	}

}
