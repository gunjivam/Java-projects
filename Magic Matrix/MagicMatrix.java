package magicsquare;

import java.io.Console;

// MagicMatrix 
// Vamsi Avinash Gunji
// Feb 7th 2018
// Generates a magic square of order n. A magic squares is an 3-by-3 matrix of the integers 1 to n^2, such that all row, column, and diagonal sums are equal.
//One way to generate a magic square when n is odd is to assign
//  the integers 1 to n^2 in ascending order, starting at the
// bottom, middle cell. Repeatedly assign the next integer to the
// cell adjacent diagonally to the right and down. If this cell
//  has already been assigned another integer, instead use the
//  cell adjacently above. Use wrap-around to handle border cases.
/*
Example:
Magic Square of size 3
----------------------

 2  7  6
 9  5  1
 4  3  8 


Steps:
1. position of number 1 = (3/2, 3-1) = (1, 2)
2. position of number 2 = (1-1, 2+1) = (0, 0)
3. position of number 3 = (0-1, 0+1) = (3-1, 1) = (2, 1)
4. position of number 4 = (2-1, 1+1) = (1, 2)
   Since, at this position, 1 is there. So, apply condition 2.
   new position=(1+1,2-2)=(2,0)
5. position of number 5=(2-1,0+1)=(1,1)
6. position of number 6=(1-1,1+1)=(0,2)
7. position of number 7 = (0-1, 2+1) = (-1,3) // this is tricky, see condition 3 
   new position = (0, 3-2) = (0,1)
8. position of number 8=(0-1,1+1)=(-1,2)=(2,2) //wrap around
9. position of number 9=(2-1,2+1)=(1,3)=(1,0) //wrap around
*/

public class MagicMatrix {
	 public static void main(String[] args) {
		 
		 
		 	int [][] A= {{1,1},{1,1}} ;//true
			int [][] B= {{5,3,1},{1,2,3},{2,4,6}}; //false
			int [][] C= {{2,7,6},{9,5,1},{4,3,8}} ;//true

			System.out.println("Is it a magic square: " + MagicSquare(A));
			System.out.println("Is it a magic square: " + MagicSquare(B));
			System.out.println("Is it a magic square: " + MagicSquare(C));
		 
		 }
		   static boolean MagicSquare(int[][] msquare){

			   int n = sumOfRow(msquare[0]);

		       // sum of rows check against n
		       for (int[] row : msquare)
		       {
		          int s = sumOfRow(row);  //Creating a variable s which is sum of row 
		          if (s != n) // If s is not equal to n return false, because n is sum of row
		        	  
		          return false;   
		       }
		       int s = 0;

		       //sum of columns check against n
		       for(int i = 0; i < msquare.length; i++){
		         s = 0;
		         for(int j = 0; j < msquare.length; j++){
		          s += msquare[j][i]; 
		         }
		         if(s != n){
		            return false;
		         }
		       }

		       //diagonal from top left corner to right bottom corner
		        s = 0;
		       for (int i = 0; i < msquare.length; i++)
		       {
		          s += msquare[i][i];
		       }
		       if (s != n)
		          return false;

		     //diagonal from top right to bottom left corner 
		       s = 0;
		       for (int i = 0; i < msquare.length; i++)
		       {
		          s += msquare[i][msquare.length - 1 - i];
		       }
		       if (s != n)
		          return false;
		       return true;
		    } 

		   //returns the sum of the elements in the row
		   private static int sumOfRow(int[] row){
		      int s = 0;
		      for(int el : row){
		         s += el;
		      }
		      return s;
		   }

		}  
