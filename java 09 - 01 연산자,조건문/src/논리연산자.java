
public class 논리연산자 {

	public static void main(String[] args) {
		boolean isTvOn = false;
		//not
	    System.out.println(!isTvOn);
	    
	    //and 연산 - 양쪽에 있는 값이 모두 참인 경우만
	    System.out.println(true && true);
	    System.out.println(true && false);
	    System.out.println(false && true);
	    System.out.println(false && false);
	    
	    //or 연산 - 하나라도 참인 경우
	    System.out.println(true || true);
	    System.out.println(true || false);
	    System.out.println(false || true);
	    System.out.println(false || false);
	    
	    
	}
	

}
