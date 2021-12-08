import java.util.Arrays;

public class numbersÈ°¿ë {

	public static void main(String[] args) {
			// Scanner sc = new Scanner(System.in)
			numbers nb = new numbers();
			//	nb.getDivisors(base)
		
			boolean result =	nb.isDivisor(10, 2);
			System.out.println(result);
			
			int [] array = nb.getDivisors(15);
			System.out.println(Arrays.toString(array));
			
			result = nb.isPrime(19);
			System.out.println(result);
	}

}
