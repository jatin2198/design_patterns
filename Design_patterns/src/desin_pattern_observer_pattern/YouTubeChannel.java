package desin_pattern_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
	
	List<Observer> subscriber=new ArrayList<Observer>();

	@Override
	public void subscribe(Observer observer) {
		// TODO Auto-generated method stub
		this.subscriber.add(observer);
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		// TODO Auto-generated method stub
		this.subscriber.remove(observer);
		
	}

	@Override
	public void sendChannelUpdates(String title) {
		// TODO Auto-generated method stub
		
		this.subscriber.forEach(obser->{
			obser.getChannelupdates(title);
		});
		
	}
	

}
