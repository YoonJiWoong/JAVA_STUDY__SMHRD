package ��ĳ����;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog = new Dog();
		Cat cat = new Cat();
		System.out.println(dog.leg); // ���� �ִ°� �޾����� 4 //��ӹ��� �ٸ����� ���!
		dog.bark(); // �۸��� ���
		///////////////////////////////////////////////
		Animal animal = dog; 
		// ��ĳ���� --> ����Ŭ������ Ÿ���� ���� Ŭ���� Ÿ������  �ٲپ��ִ°�
		// �������� ������ �ٲ�!!
		// �ִϸ��� ���׶�� ��ü�� ���� Ŭ������ �־���... : �̰� ��ĳ����
		animal.bark();
		// ������ ������ ����! �� ���;� �ϴµ�!!
		// bark' �� �Ǿ� �۸� ���ٰ� ���!
		
		
//		System.out.println(animal.color);
		
		//////////////////////
		cry(dog);
		cry(cat);
		// ������ �ǹ�
		
	}
	public static void cry(Animal animal) {
		animal.bark();
		
	}
}
