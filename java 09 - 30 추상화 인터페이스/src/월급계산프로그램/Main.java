package ���ް�����α׷�;
public class Main {

	public static void main(String[] args) {

		
// RegularEmployee ��ü ����
		RegularEmployee regular = new RegularEmployee("SMHRD001", "ȫ�浿", 4000, 400);
//		regular.print();
//		System.out.println(regular.getMoneyPay() + "����");

		System.out.println(regular.getMoneyPay());
		regular.print();
		
		Employee ep = regular; //�߻�, ��ĳ����
		System.out.println(ep.getMoneyPay()); 
	
		ep.print();
		
	}

}
