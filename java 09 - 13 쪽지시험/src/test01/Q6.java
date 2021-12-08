package test01;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String [] fruits= {"자몽","망고","바나나","멜론",};
		
		System.out.print("찾고싶은 과일 : ");
		String a = sc.next();
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals(a)) {
				System.out.println(a+"의 위치는"+(i+1)+"번에 있습니다.");
	
			}
			
	}
}
}