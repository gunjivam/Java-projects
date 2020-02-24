package VAMSIAVINASHGUNJIProject;

public class Triangles implements shapes {
	//A triangle is VAMSIAVINASHGUNJIProject with 3 sides which are positive.
	// We are assuming the following sides whole triangle inequality rule.
	// Sum of two sides are greater than third side.
	//
	protected Double side1,side2,side3; //To be used by its classes which extends this triangles class.
	//
	protected Triangles(Double s1, Double s2,Double s3) {
		//Constructor 
		side1=s1; 	//Constructor.
		side2=s2;
		side3=s3;
	}
	

	public Double getarea(){
		//Purpose: To get the area of triangle in general. using Heron's formula
		//Formula: Sqrt[s*s-a*s-b*s-c] Note that s is semiperimeter. This formula holds good for every triangle with valid sides.
		//
		return Math.sqrt((getPerimeter()/2)*((getPerimeter()/2)-side1)*((getPerimeter()/2)-side2)*((getPerimeter()/2)-side3));
		
		
	}

	
	public Double getPerimeter() {
		//Purpose: To get the perimeter of triangle. 
		//This can be double or Integer depending on your input
		
		return (double) (this.side1 + this.side2 + this.side3);
		
		
	}
	

}
