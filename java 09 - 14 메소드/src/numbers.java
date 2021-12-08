import java.util.Arrays;

public class numbers {
	// numbers -> ������ �ƴ� �ٸ� ����� ���� �� �� �ְ� �ϴ¿뵵 -> �׷��� ���� üũ ����!
	// ���� ������ : ��ɿ� ������ �� �ִ� ������ �����ϴ� Ű���� (private ?? - ���� �򰥷ȴ� ����!)
	// private : �޼ҵ尡 ���ǵ� ���� �ȿ����� ��� ����
	// public : �ܺ� ���Ͽ��� ��� ����
	
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
