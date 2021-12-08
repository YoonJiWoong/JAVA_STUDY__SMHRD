// 17일 
public class _0917_Q1_입력한계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		System.out.println(cal(num1,num2,op));
	}

	private static int cal(int num1, int num2, char op) {
		int num=0;
		if(op == '-'){
			num=num1 - num2;
		}else if(op == '+'){
			num= num1 + num2;
		}else if(op == '*'){
			num= num1 * num2;
		}else if(op == '/'){
			num= num1 / num2;
		}

		return num;
	}

}
