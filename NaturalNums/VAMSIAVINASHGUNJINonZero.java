package NaturalNums;

public class VAMSIAVINASHGUNJINonZero implements GUNJI_VAMSIAVINASH_interface
	{
		private int n;// the value of this natnum
		private GUNJI_VAMSIAVINASH_interface prev;// the natnum used to construct this natnum
		
		public VAMSIAVINASHGUNJINonZero(GUNJI_VAMSIAVINASH_interface natnum)
		{
			n=natnum.getVal() +1;
			prev= natnum;}
		public VAMSIAVINASHGUNJINonZero() {
			
		}
		public int getVal() {return (n);}
		public boolean isZero() {return(false);}
		public boolean equal(GUNJI_VAMSIAVINASH_interface B) {return (this.n== B.getVal());}
		public GUNJI_VAMSIAVINASH_interface succ() {return(new VAMSIAVINASHGUNJINonZero(this));}
		public GUNJI_VAMSIAVINASH_interface pred() throws Exception
		{return(prev);}
		public GUNJI_VAMSIAVINASH_interface add(GUNJI_VAMSIAVINASH_interface a)
		{ try
		{ 
			return(this.pred().add(a).succ());
		}
		catch(Exception e)
		{
			System.out.println("Error add: " + e.getMessage());
			return (null);
		}
		}
		
		
		public boolean lessthan(GUNJI_VAMSIAVINASH_interface a) 
		{
			return(this.getVal() < a.getVal());
			}
			
	
		
		public boolean greaterthan(GUNJI_VAMSIAVINASH_interface a) {
			
			return (this.getVal() > a.getVal());
			}
			
		//
		public boolean lessthaneq(GUNJI_VAMSIAVINASH_interface a) {
			
				return (this.getVal() < a.getVal() || this.getVal()==a.getVal());
		
		}
		
		public boolean greaterthaneq(GUNJI_VAMSIAVINASH_interface a) {
			
			return (this.getVal() > a.getVal() || this.getVal()==a.getVal());
		}
		// Doubt on this
		public GUNJI_VAMSIAVINASH_interface sub(GUNJI_VAMSIAVINASH_interface a) throws Exception
		{try
		{
			return(this.sub(a.pred()).pred());
		}
		catch(Exception e)
		{
			System.out.println("Error sub: " + e.getMessage());
			return (null);
		}
		}
		
		@Override
		public GUNJI_VAMSIAVINASH_interface multiplication(GUNJI_VAMSIAVINASH_interface b) {
			
				try {
					return(this.pred().multiplication(b).add(b));
				} catch (Exception e) {
					// 
					System.out.println("Error sub: " + e.getMessage());
				}
			return null;
		}
		
		public GUNJI_VAMSIAVINASH_interface quotient(GUNJI_VAMSIAVINASH_interface b) throws Exception {
			if (b.isZero())
			{throw new Exception("We can't divide number with zero");}
			else if (this.getVal()<b.getVal())
			{return (new VAMSIAVINASHGUNJIZero());}
			else
				return(this.sub(b).quotient(b).succ());
		}
		//
		public GUNJI_VAMSIAVINASH_interface remainder(GUNJI_VAMSIAVINASH_interface b) throws Exception {
			if(b.isZero())
			{throw new Exception("we can't divide number with zero");}
			else if (this.getVal()<b.getVal())
				{return this;}
			else return(this.sub(b).remainder(b));
			
			
		}
		@Override
		public void print() {
			// 
			System.out.println("The value is: " + this.getVal());
			
			
		}
		public String toString() {
			
			return(Integer.toString(getVal()));
			
		}//
		//
		public GUNJI_VAMSIAVINASH_interface Factorial() throws Exception
			{
				if(this.isZero())
					
					//System.out.println("the value of a:" + a.getVal() );
		
					{
						return(new VAMSIAVINASHGUNJIZero().succ());
								}
					else
					{
						try 
						{
								
						//return(a.multiplication(Factorial(a.pred())));
								return(this.multiplication(this.pred().Factorial()));
								
										} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
											}
						}
					return null;
			}
			
		

		
		
	}
		
		
	
	
		
		
