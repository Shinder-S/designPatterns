package strategyPattern;

public class main {

	public static void main(String[] args) {
		
		Location location1 = new Location(50.0, 100.0);
		Location location2 = new Location(30.0, 500.0);
		
		Map map = new Map(location1, new MovementStrategyWalking());
		
		System.out.println(map.calculateTimeToLocation(location2));
		
		map.setMovementStrategy(new MovementStrategyCar(false));
		
		System.out.println(map.calculateTimeToLocation(location2));
	}

}
