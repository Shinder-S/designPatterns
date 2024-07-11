package ObaserverPattern;

public class main {

	public static void main(String[] args) {
		
		Reader reader = new Reader("Peter", 16);
		Reader anotherReader = new Reader("Uncle Lu", 65);
		
		NewsPaper newsPaper = new NewsPaper("Daily Summer");

		newsPaper.addObserver(reader);
		newsPaper.addObserver(anotherReader);
		
		newsPaper.publish();
	}

}
