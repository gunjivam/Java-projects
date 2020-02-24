package Abstract;

abstract class vehicle {
protected int seats;// Purpose: Represents the number
protected int fuel_efficiency; // purpose: represents the number of miles per gallon
protected int tank_size;// Purpose: represents the size of the tank in gallons
public int getSeats() {
	return seats;// Return the seats
}
public int getFuelEfficiency() {
	return fuel_efficiency;// Returns the fuel efficiency
}
public int getTankSize() {
	return tank_size; //returns the tank size
}
public int getMaxDistance() {
	return (fuel_efficiency*tank_size);// returns the max distance travelled by a vehicle by multiplying the tank size with fuel efficiency
	
}
abstract double PricePerMile(double x);



}
