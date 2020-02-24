package VAMSIAVINASHGUNJIProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class shapetest {
////////////////// NOTE: all the triangle sides are valid sides which holds triangle inequality rule //////////////////////////
	@Test
	public void Equilateraltests() {
		
		Equilateral e1= new Equilateral(1.0);
		Equilateral e2= new Equilateral(2.0);
		Equilateral e3= new Equilateral(3.0);
		Equilateral e4= new Equilateral(4.0);	
		Equilateral e5= new Equilateral(5.0);
		Equilateral e6= new Equilateral(6.0);
		Equilateral e7= new Equilateral(7.0);
		Equilateral e8= new Equilateral(8.0);
		Equilateral e9= new Equilateral(9.0);
		Equilateral e10= new Equilateral(10.0);
		//Tests for Area (Equilateral Triangle)
		
		assertEquals(e1.getarea(),0.43,0.01);
		assertEquals(e2.getarea(),1.73,0.02);
		assertEquals(e3.getarea(),3.9,0.02);
		assertEquals(e4.getarea(),6.93,0.02);
		assertEquals(e5.getarea(),10.83,0.02);
		assertEquals(e6.getarea(),15.59,0.02);
		assertEquals(e7.getarea(),21.22,0.02);
		assertEquals(e8.getarea(),27.71,0.02);
		assertEquals(e9.getarea(),35.07,0.02);
		assertEquals(e10.getarea(),43.3,0.02);
		//Tests for Perimeter of Equilateral Triangle
		
		assertEquals(e1.getPerimeter(),3,0.0001);
		assertEquals(e2.getPerimeter(),6,0.0001);
		assertEquals(e3.getPerimeter(),9,0.0001);
		assertEquals(e4.getPerimeter(),12,0.0001);
		assertEquals(e5.getPerimeter(),15,0.0001);
		assertEquals(e6.getPerimeter(),18,0.0001);
		assertEquals(e7.getPerimeter(),21,0.0001);
		assertEquals(e8.getPerimeter(),24,0.0001);
		assertEquals(e9.getPerimeter(),27,0.0001);
		assertEquals(e10.getPerimeter(),30,0.0001);
	}
		//Tests for Iscosceles triangle 
		@Test
		public void isoscelestests() {
			
			isosceles i2= new isosceles(2.0,1.0);
			
			isosceles i4= new isosceles(3.0,1.0);
			
			isosceles i6= new isosceles(4.0,1.0);
			
			isosceles i8= new isosceles(5.0,1.0);
			
			isosceles i10= new isosceles(6.0,1.0);
			
			
			 //Tests for Area of Isosceles Triangle
			
			
			assertEquals(i2.getarea(),0.97,0.01);
			
			assertEquals(i4.getarea(),1.48,0.01);
			
			assertEquals(i6.getarea(),1.98,0.01);
			
			assertEquals(i8.getarea(),2.49,0.01);
			
			assertEquals(i10.getarea(),2.99,0.01);
			
			
			
			//Tests for Perimeter of Isosceles Triangle
			
			assertEquals(i2.getPerimeter(),5,0.01);
			
			
			assertEquals(i4.getPerimeter(),7.0,0.01);
			
			assertEquals(i6.getPerimeter(),9,0.01);
			
			assertEquals(i8.getPerimeter(),11.0,0.01);
			
			assertEquals(i10.getPerimeter(),13.0,0.01);
		}
		
		@Test
		public void Scalenetest() {
			//Tests for Scalene Triangle
			
			Scalene s2= new Scalene(2.0,3.0,4.0);
			
			Scalene s4= new Scalene(10.0,5.0,14.0);
			Scalene s5= new Scalene(5.0,6.0,4.0);
			Scalene s6= new Scalene(6.0,7.0,5.0);		
			Scalene s7= new Scalene(7.0,8.0,2.0);
			
			
			
			//Tests for area of Scalene Triangle
			assertEquals(s2.getarea(),2.9,0.01);
			assertEquals(s4.getarea(),17.61,0.01);
			assertEquals(s5.getarea(),9.92,0.01);
			assertEquals(s6.getarea(),14.7,0.01);
			assertEquals(s7.getarea(),6.44,0.01);
			
			//Tests for Perimeter of Scalene Triangle
			assertEquals(s2.getPerimeter(),9.0,0.01);
			assertEquals(s4.getPerimeter(),29.0,0.01);
			assertEquals(s5.getPerimeter(),15.0,0.01);
			assertEquals(s6.getPerimeter(),18.0,0.01);
			assertEquals(s7.getPerimeter(),17.0,0.01);
			
			
		}
		
		@Test
		public void Rectangletest() {
			
			//Test for Rectangle// angle is always 90 so all the inputs are with 90 degree or Pi/2
			Rectangle r1= new Rectangle(1,2,Math.PI/2);
			Rectangle r2= new Rectangle(2,3,Math.PI/2);
			Rectangle r3= new Rectangle(3,4,Math.PI/2);
			Rectangle r4= new Rectangle(4,5,Math.PI/2);
			Rectangle r5= new Rectangle(5,6,Math.PI/2);
			//Tests for area of rectangle with given sides
			assertEquals(r1.getarea(),2.0,0.01);
			assertEquals(r2.getarea(),6.0,0.01);
			assertEquals(r3.getarea(),12.0,0.01);
			assertEquals(r4.getarea(),20.0,0.01);
			assertEquals(r5.getarea(),30.0,0.01);
			//Tests for Perimeter of Rectangle 
			assertEquals(r1.getPerimeter(),6.0,0.01);
			assertEquals(r2.getPerimeter(),10.0,0.01);
			assertEquals(r3.getPerimeter(),14.0,0.01);
			assertEquals(r4.getPerimeter(),18.0,0.01);
			assertEquals(r5.getPerimeter(),22.0,0.01);
			
			
			
		}
		
		@Test
		public void Squaretest() {
			//Tests for Square
			Square sq1= new Square(1,Math.PI/2);
			Square sq2= new Square(2,Math.PI/2);
			Square sq3= new Square(3,Math.PI/2);
			Square sq4= new Square(4,Math.PI/2);
			Square sq5= new Square(5,Math.PI/2);
			//Tests for Square area
			assertEquals(sq1.getarea(),1.0,0.01);
			assertEquals(sq2.getarea(),4.0,0.01);
			assertEquals(sq3.getarea(),9.0,0.01);
			assertEquals(sq4.getarea(),16.0,0.01);
			assertEquals(sq5.getarea(),25.0,0.01);
			//Tests for Square Perimeter
			assertEquals(sq1.getPerimeter(),4.0,0.01);
			assertEquals(sq2.getPerimeter(),8.0,0.01);
			assertEquals(sq3.getPerimeter(),12.0,0.01);
			assertEquals(sq4.getPerimeter(),16.0,0.01);
			assertEquals(sq5.getPerimeter(),20.0,0.01);
			
			
			
			
		}
		
		@Test
		public void Rhombustest() {
			//Test for Rhombus
			
			Rhombus rho1= new Rhombus(1,Math.PI/4);
			Rhombus rho2= new Rhombus(2,Math.PI/6);
			Rhombus rho3= new Rhombus(3,Math.PI/3);
			Rhombus rho4= new Rhombus(4,Math.PI/5);
			Rhombus rho5= new Rhombus(5,Math.PI/10);
		//Tests for area of rhombus
			assertEquals(rho1.getarea(),0.707,0.01);
			assertEquals(rho2.getarea(),2.0,0.01);
			assertEquals(rho3.getarea(),7.794,0.01);
			assertEquals(rho4.getarea(),9.404,0.01);
			assertEquals(rho5.getarea(),7.725,0.01);
			//Test for perimeter of rhombus
			assertEquals(rho1.getPerimeter(),4.0,0.01);
			assertEquals(rho2.getPerimeter(),8.0,0.01);
			assertEquals(rho3.getPerimeter(),12.0,0.01);
			assertEquals(rho4.getPerimeter(),16.0,0.01);
			assertEquals(rho5.getPerimeter(),20.0,0.01);
			
			
			
			
		}
		
		@Test
		
		public void Circletest()
		{	//Test for circle
			Circle c1= new Circle(1);
			Circle c2= new Circle(2);
			Circle c3= new Circle(3);
			Circle c4= new Circle(4);
			Circle c5= new Circle(5);
			//Test for area of circle
			assertEquals(c1.getarea(),3.141,0.01);
			assertEquals(c2.getarea(),12.5664,0.01);
			assertEquals(c3.getarea(),28.2743,0.01);
			assertEquals(c4.getarea(),50.2655,0.01);
			assertEquals(c5.getarea(),78.5398,0.01);
			//Test for perimeter of circle
			assertEquals(c1.getPerimeter(),6.28319,0.01);
			assertEquals(c2.getPerimeter(),12.5664,0.01);
			assertEquals(c3.getPerimeter(),18.8496,0.01);
			assertEquals(c4.getPerimeter(),25.1327,0.01);
			assertEquals(c5.getPerimeter(),31.4159,0.01);
			
			
			
			
		
		}
		
		
		
	}

