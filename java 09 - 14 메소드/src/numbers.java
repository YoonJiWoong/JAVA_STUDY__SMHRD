import java.util.Arrays;

public class numbers {
	// numbers -> 실행이 아닌 다른 사람이 갖다 쓸 수 있게 하는용도 -> 그래서 메인 체크 안해!
	// 접근 제한자 : 기능에 접근할 수 있는 범위를 설정하는 키워드 (private ?? - 내가 헷갈렸던 내용!)
	// private : 메소드가 정의된 파일 안에서만 사용 가능
	// public : 외부 파일에서 사용 가능
	
	public static boolean isPrime(int base) {
		return getDivisors(base).length == 2;
	}

	public static int[] getDivisors(int base) {
		int[] array = new int[base];
		int index = 0;
		for (int i = 1; i <= base; i++) {
			if (isDivisor(base, i)) {
				array[index++] = i;
			}
		}
		return Arrays.copyOf(array, index);
	}

	public static boolean isDivisor(int base, int divisor) {
		return base % divisor == 0;
	}

}
