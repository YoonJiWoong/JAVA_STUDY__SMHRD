package 상속기초;

// 슈퍼클래스 : 코드를 물려주는 쪽
public class 마우스 {//휠마우스,인체공학마우스에 필요한 기능 다 가지고 있어!!
	// 부모라고 모든걸 다 주지는 않을 수도 있어... 구지... 상속받을 필요는 없을것들 있을 수 있어...
	// 그런경우 접근제한자를 private 으로 바꾸면 상속이 안일어나
	
	public void 좌클릭() {System.out.println("Left Click");}
	public void 우클릭() {System.out.println("Right Click");}
	private void 드래그() {System.out.println("드래그 드래그");} // 좌클릭, 우클릭만 존재해....
	
	

}
