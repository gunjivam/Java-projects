package NaturalNums;

public interface GUNJI_VAMSIAVINASH_interface {
		public int getVal();
		public boolean isZero();
		public boolean equal(GUNJI_VAMSIAVINASH_interface B);
		public GUNJI_VAMSIAVINASH_interface succ();
		public  GUNJI_VAMSIAVINASH_interface pred() throws Exception;
		public GUNJI_VAMSIAVINASH_interface add(GUNJI_VAMSIAVINASH_interface a);
		public boolean lessthan(GUNJI_VAMSIAVINASH_interface a);
		public boolean greaterthan(GUNJI_VAMSIAVINASH_interface a);
		public boolean lessthaneq(GUNJI_VAMSIAVINASH_interface a);
		public boolean greaterthaneq(GUNJI_VAMSIAVINASH_interface a);
		public GUNJI_VAMSIAVINASH_interface sub(GUNJI_VAMSIAVINASH_interface a) throws Exception;
		public GUNJI_VAMSIAVINASH_interface multiplication(GUNJI_VAMSIAVINASH_interface b);
		public GUNJI_VAMSIAVINASH_interface quotient(GUNJI_VAMSIAVINASH_interface b) throws Exception;
		public GUNJI_VAMSIAVINASH_interface remainder(GUNJI_VAMSIAVINASH_interface b) throws Exception;
		
		public void print();
		public String toString();
		public GUNJI_VAMSIAVINASH_interface Factorial() throws Exception;
		
		//Purpose to add this Inatnum with the given Inatnum
		
}


