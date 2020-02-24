package Abstract;

public class Car extends vehicle{
	
	private int price;
	public Car(int s , int f, int t, int p) {
		seats=s;
		fuel_efficiency=f;
		price=p;
		tank_size=t;
		
	}
	public int getPrice() {
		return price;
	}
	
	public double PricePerMile(double price) {
		return (price/this.fuel_efficiency/this.seats);
		
		
	}

}
