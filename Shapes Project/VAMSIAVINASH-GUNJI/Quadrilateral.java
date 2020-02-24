package VAMSIAVINASHGUNJIProject;

public class Quadrilateral implements shapes {
	//A quadrilateral is two dimensional figure which has four sides.
	// Assuming that there are no negative values for sides. 
	
 protected Integer length, breadth;	//Purpose: Each quadrilateral (Rectangle,Square, Rhombus, they have two sides which we require to find area and perimeter
 
 protected Double alpha; //Purpose: Alpha is the angle between any two sides we take to calculate area. Alpha is angle in between length and breadth.
 //Note: Alpha is 90 or Pi/2 for Square and Rectangle since all the adjacent angles in Square and rectangle are 90.

 	protected Quadrilateral(Integer l,Integer b, Double a) {
 		//Purpose: Constructor 
 		length=l;
 		breadth=b;
 		alpha=a;
 	}
	
	public Double getarea() {
		//Purpose: To get the area of any Quadrilateral
		// Area of Square: length * length --> we observe angle between any two sides is 90
		// Area of Rectangle: length * Breadth --> we observe angle between any two sides is 90
		// Area of rhombus : length * length* Sin (angle between any two sides).
		//Note: Alpha ranges between 0< alpha < Pi. It cannot be greater than or equal to Pi or Zero.
		//Sum of any two adjacent angles in rhombus is 180 which means if you pick any angle between any side. sin (180-alpha) = Sin (alpha) always
		
		
		return length*breadth*Math.sin(alpha);
		
	}
	
	public Double getPerimeter() {
		//Purpose: To get the perimeter of any quadrilateral
		//Perimeter of Square: 4* length= 2*(length+ length)
		//Perimeter of Rectangle: 2*(length + breadth)
		//Perimeter of Rhombus: 4* (length)= 2* (length+length)
		return (double) (2*(length+breadth));
	}
 	
}
