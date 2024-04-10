package desin_pattern_observer_pattern;

public class Subscriber implements Observer {

	private String nameOfSubscriber;
	
	Subscriber(String name){
		this.nameOfSubscriber=name;
		
	}
	
	@Override
	public void getChannelupdates(String title) {
		// TODO Auto-generated method stub
		
		System.out.println(this.nameOfSubscriber+" get ur "+"New Updates on Channel "+title);

	}

}
