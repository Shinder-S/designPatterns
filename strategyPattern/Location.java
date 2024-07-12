package strategyPattern;

public class Location {
	
	private Double latitude;
	private Double longitude;
	
	public Location(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Double calculateDistance(Location location) {
		Double latitudeDistance = Math.pow(this.latitude - location.latitude, 2);
		Double longitudeDistance = Math.pow(this.latitude - location.latitude, 2);
		
		return Math.sqrt(latitudeDistance + longitudeDistance);
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}
	
	
}
