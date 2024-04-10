package desin_pattern_observer_pattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		YouTubeChannel channel=new YouTubeChannel();
		Subscriber shiv=new Subscriber("shiv".toUpperCase());
		Subscriber jatin=new Subscriber("jatin".toUpperCase());
		
		channel.subscribe(shiv);
		channel.subscribe(jatin);
		channel.sendChannelUpdates("The Rock vs Cody video");
		//channel.sendChannelUpdates();
	}

}
