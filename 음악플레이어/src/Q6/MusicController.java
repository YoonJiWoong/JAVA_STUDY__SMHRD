package Q6;

import java.util.ArrayList;



public class MusicController {

	ArrayList<MusicVO> musicList = new ArrayList<MusicVO>();
		
	public MusicController() {
		
	}
	public void addMusic(MusicVO a) {
		musicList.add(a);
		
	}
	
	public void musicList() {
		for(int i=0; i<musicList.size(); i++) {
			System.out.println("���� :"+musicList.get(i).getSinger()+" ���� :"+musicList.get(i).getTitle()
			+" �ð� :"+musicList.get(i).getPlayTime()+"��");
		}
				
		
	}
	
	
	public int currentIndex;
	
	
	public void play() {
	
		System.out.println("���� :"+musicList.get(currentIndex).getSinger()+" ���� :"+musicList.get(currentIndex).getTitle()
				+" �ð� :"+musicList.get(currentIndex).getPlayTime()+"��");
		
		
	}
	
	
	public void nextplay() {
		if(currentIndex<musicList.size()-2) {
			currentIndex++;
		}else {
			currentIndex=musicList.size()-1;
		}
		
		System.out.println("���� :"+musicList.get(currentIndex).getSinger()+" ���� :"+musicList.get(currentIndex).getTitle()
				+" �ð� :"+musicList.get(currentIndex).getPlayTime()+"��");
		
	}
	public void preplay() {
		if(currentIndex>=1) {
			currentIndex--;
		}else {
			currentIndex=0;
		}
		
		System.out.println("���� :"+musicList.get(currentIndex).getSinger()+" ���� :"+musicList.get(currentIndex).getTitle()
				+" �ð� :"+musicList.get(currentIndex).getPlayTime()+"��");
		
	}
	
	
	
	
}
