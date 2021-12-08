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
			System.out.println("가수 :"+musicList.get(i).getSinger()+" 제목 :"+musicList.get(i).getTitle()
			+" 시간 :"+musicList.get(i).getPlayTime()+"초");
		}
				
		
	}
	
	
	public int currentIndex;
	
	
	public void play() {
	
		System.out.println("가수 :"+musicList.get(currentIndex).getSinger()+" 제목 :"+musicList.get(currentIndex).getTitle()
				+" 시간 :"+musicList.get(currentIndex).getPlayTime()+"초");
		
		
	}
	
	
	public void nextplay() {
		if(currentIndex<musicList.size()-2) {
			currentIndex++;
		}else {
			currentIndex=musicList.size()-1;
		}
		
		System.out.println("가수 :"+musicList.get(currentIndex).getSinger()+" 제목 :"+musicList.get(currentIndex).getTitle()
				+" 시간 :"+musicList.get(currentIndex).getPlayTime()+"초");
		
	}
	public void preplay() {
		if(currentIndex>=1) {
			currentIndex--;
		}else {
			currentIndex=0;
		}
		
		System.out.println("가수 :"+musicList.get(currentIndex).getSinger()+" 제목 :"+musicList.get(currentIndex).getTitle()
				+" 시간 :"+musicList.get(currentIndex).getPlayTime()+"초");
		
	}
	
	
	
	
}
