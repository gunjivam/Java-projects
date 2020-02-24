package NaturalNums;


	// A natnum is either 0 
	// (natnum +1)
	// Nothing needed as its nt value is a constant and it does not have a predcessor
	// An int for its value and an Inatnum for its predecessor
public class VAMSIAVINASHGUNJIZero implements GUNJI_VAMSIAVINASH_interface
	{
		public VAMSIAVINASHGUNJIZero(){};
		public int getVal() {return(0);}
		public boolean isZero() {return(true);}
		public GUNJI_VAMSIAVINASH_interface succ() {return(new VAMSIAVINASHGUNJINonZero(this));}
		public GUNJI_VAMSIAVINASH_interface pred() throws Exception
		{ // Create new exception when error occurs; String is error message
			throw new Exception("Zero has no predecessor!");}
		@Override
		public boolean equal(GUNJI_VAMSIAVINASH_interface B) {
			// TODO Auto-generated method stub
			return false;
			
		}
		public GUNJI_VAMSIAVINASH_interface add(GUNJI_VAMSIAVINASH_interface a) {return (a);}
		
		public boolean lessthan(GUNJI_VAMSIAVINASH_interface a) 
		{
			if (this.getVal() < a.getVal())
			{return true;}
			else
				{return false;}
	
		}
		
		public boolean greaterthan(GUNJI_VAMSIAVINASH_interface B) {
			{
				if(this.getVal() <B.getVal())
				{return true;}
				
			}
			return false;
		}
		//
		public boolean lessthaneq(GUNJI_VAMSIAVINASH_interface a) {
			
			{if(this.getVal() == a.getVal())
			{return true;}
			else if (this.getVal()< a.getVal())
				{return true;}}
	
			{return false;}
		}
		
		
		public boolean greaterthaneq(GUNJI_VAMSIAVINASH_interface a) {
			
			{if(this.getVal() == a.getVal())
			{return true;}
			else if (this.getVal()> a.getVal())
				{return true;}}
	
			{return false;}
		}
		//
		public GUNJI_VAMSIAVINASH_interface sub(GUNJI_VAMSIAVINASH_interface a) throws Exception{
			if (!a.isZero()) {
				throw new Exception("Cannot subtract Zero from other number! Not defined");}
			else{
			{return (this);}
		
	
		}
		
		
		}
		//
		public GUNJI_VAMSIAVINASH_interface multiplication(GUNJI_VAMSIAVINASH_interface b) {
			
			return this;
		}
		//
		public GUNJI_VAMSIAVINASH_interface quotient(GUNJI_VAMSIAVINASH_interface b) {
			//
			return (new VAMSIAVINASHGUNJIZero());
		}
		//
		public GUNJI_VAMSIAVINASH_interface remainder(GUNJI_VAMSIAVINASH_interface b) {
			//
			return this;
		}
		@Override
		public void print() {
			System.out.println("The value is: " + this.getVal());
			
		}

		public String toString() {
			return(Integer.toString(getVal()));
		}
		@Override
		public GUNJI_VAMSIAVINASH_interface Factorial() {
			
			return (new VAMSIAVINASHGUNJIZero().succ());
		}}

