
public class _0911_Q2_��������_�ɰ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
	      
	      String[] score1 = score.split(",");
	       
	      int count1 = 0;
	      int count2 = 0;
	      int count3 = 0;
	      int count4 = 0;
	      int count5 = 0;
	      
	      for(int i =0; i <=10; i++) {
	         if(score1[i].equals("A")) {
	            count1++;
	         }else if(score1[i].equals("B")) {
	            count2++;
	         }else if(score1[i].equals("C")) {
	            count3++;
	         }else if(score1[i].equals("D")) {
	            count4++;
	         }else if(score1[i].equals("F")) {
	            count5++;
	         }
	      }
	      
	      System.out.println("A : " + count1 + "��");
	      System.out.println("B : " + count2 + "��");
	      System.out.println("C : " + count3 + "��");
	      System.out.println("D : " + count4 + "��");
	      System.out.println("F : " + count5 + "��");
		
		
		
			
		

	}

}
