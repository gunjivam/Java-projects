package VAMSIAVINASHGUNJIProject;

public class Circle implements shapes {
protected Integer r;
//Circle is figure which is equidistance from its centre to any point on its circle
// Circle takes in one radius and returns Area and Perimeter
//Area of circle = Pi* r*r
//Perimeter of Circle= 2*Pi*r

	public Circle(int radius) {
		//Purpose: Constructor use
		//We can use public here because there are no classes which extends this circle any more.
		
	r=radius;
}


	public Double getarea() {
		//Purpose: To find area of circle with given radius
		
		return Math.PI*r*r;
	}

	
	public Double getPerimeter() {
		//Purpose: To find the Perimeter of circle with given radius
		
		return 2*Math.PI*r;
	}

}
