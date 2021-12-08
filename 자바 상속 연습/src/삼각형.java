
public class 삼각형 extends 도형 { // 밑변 * 높이 / 2
	
//	static double 밑변;
//	static double 높이;
	
	static String  name = "삼각형";
	
	
	public 삼각형(double 밑변, double 높이) {
		
		this.밑변 = 밑변;
		this.높이 = 높이;
		
	}
	
	public double 넓이() { // 재정의 오버라이딩
		return 밑변*높이/2;
	}
	

	public static String getName() {
		return name;
	}

	
	
	
}
