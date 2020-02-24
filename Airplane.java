package Abstract;

public class Airplane extends vehicle {

	private int max_altitude;
	public Airplane(int s, int f, int t, int a) {
		seats=s;
		fuel_efficiency=f;
		max_altitude=a;
		tank_size=t;
	}
	public int getMaxAltitude() {
		return max_altitude;
	}
	public boolean safetravel(int x) {
		return (x< 0.85*this.getMaxDistance());
	}
//
	
	public double PricePerMile(double price) {
		
		
		return (price/this.fuel_efficiency/this.seats*0.95*this.tank_size);
	}
	
}
