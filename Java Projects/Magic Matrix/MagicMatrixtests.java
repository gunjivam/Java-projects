package magicsquare;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicMatrixtests {
		
		int [][]A= {{1,1},{1,1}} ;//true
		int [][]B= {{5,3,1},{1,2,3},{2,4,6}}; //false
		int [][] C= {{2,7,6},{9,5,1},{4,3,8}} ;//true
	
	   @Test
	void test() {
		
	assertEquals(MagicMatrix.MagicSquare(A),true);
	assertEquals(MagicMatrix.MagicSquare(B),false);
	assertEquals(MagicMatrix.MagicSquare(C),true);
	
	}

}
