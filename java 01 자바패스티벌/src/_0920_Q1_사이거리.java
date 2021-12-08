import java.util.Arrays;

public class _0920_Q1_사이거리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = {92,32,52,9,81,2,68};
		int result = 100;
		
	
		
		int array[] = new int[2];
		
		for (int i = 0; i < point.length; i++) {
			for(int j=i+1;j<point.length;j++)
				if (point[i] - point[j] >= 0) {
					if (result > point[i] - point[j]) {
						result = point[i] - point[j];
						array[0] = i;
						array[1] = j;
					}

				} else if (point[i] - point[j] < 0) {
					if (result > point[j] - point[i]) {
						result = point[j] - point[i];
						array[0] = i;
						array[1] = j;
					}

				}

			}

		System.out.println("result = " + Arrays.toString(array));
		
		}
	}


