// HOMRWORK-1 -> Magic Square
//Author -> DR. Ghazizadeh
// 2/8/2017
// In this assignment we make a class called MagicMatrix which takes in a matrix and check 
// whether the sum of rows = sum of column = sum of elements of diagonal; if this condition
//is true then it returns a boolean value of true or else a false 

public class MagicMatrix {
	 public static void main(String[] args) {
		    
		 int [][] square =A; 
		 int [][] square =B;
		 int [][] square =C;
		 	int [][]A= {{1,1},{1,1}} ;//true
			int [][]B= {{5,3,1},{1,2,3},{2,4,6}}; //false
			int [][] C= {{2,7,6},{9,5,1},{4,3,8}} ;//true
		
		  //{{1,1},{1,1}} //true
		   // {{5,3,1},{1,2,3},{2,4,6}} //false
		   // {{2,7,6},{9,5,1},{4,3,8}} //true
 System.out.println("Is it a magic square: " + MagicSquare(square));   
		 }
		   private static boolean MagicSquare(int[][] square){

		       int n = rSum(square[0]);

		       for (int[] row : square)
		       {
		          int sum = rSum(row);        
		          if (sum != n)
		          return false;   
		       }

		       int sum = 0;
		       for (int i = 0; i < square.length; i++)
		       {
		          sum += square[i][i];
		       }
		       if (sum != n)
		          return false;

		       sum = 0;
		       for (int i = 0; i < square.length; i++)
		       {
		          sum += square[i][square.length - 1 - i];
		       }
		       if (sum != n)
		          return false;
		       return true;
		    } 

		   private static int rSum(int[] row){
		      int sum = 0;
		      for(int el : row){
		         sum += el;
		      }
		      return sum;
		   }
		}