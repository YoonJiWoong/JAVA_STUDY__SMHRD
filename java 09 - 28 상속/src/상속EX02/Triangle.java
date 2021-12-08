package 상속EX02;

public class Triangle extends Figure {
	// (밑변 x 높이) / 2
	private double base;
	private double height;
	private static String name = "삼각형";

	// 공용변수를 적용하려면 satatic 붙임
	// static에 붙으면 공용변수가 된다.

	// 생성자
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;

	}

	// 넓이 계산 메소드
	// 메소드 오버라이딩 : 재정의
	public double calArea() {
		return base * height / 2;
	}

	public void setName() {
		this.name = "삼각형";
	}

	public static String getName() {
		return name;
	}

}
