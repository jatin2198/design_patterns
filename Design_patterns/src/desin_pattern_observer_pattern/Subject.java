package desin_pattern_observer_pattern;

public interface Subject {

	void subscribe(Observer observer);
	void unsubscribe(Observer observer);
	void sendChannelUpdates(String title);
}
