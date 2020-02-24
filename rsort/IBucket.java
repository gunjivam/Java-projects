package rsort;

public interface IBucket<X> {
	//Purpose: To add the given element to this bucket
	//Effect: The bucket has the given element as its last element added
	public void add(X elem);
	 //Purpose: Place bucket elements into the given array starting at index i
	//Effect: Clears the bukcet
	
	public int toArray(X[]A ,int i);
	
	
}
