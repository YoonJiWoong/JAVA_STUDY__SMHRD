package 상속기초;

public class 상속Main {

	public static void main(String[] args) {

		휠마우스 h = new 휠마우스();
		h.우클릭();
		h.좌클릭();
//		h.드래그(); // 메소드의 접근 제한자가 private 이면 상속이 불가능하다.
//		public에서 private로 바꿔서 상속 못받게 해벼려서...
		

	}

}
