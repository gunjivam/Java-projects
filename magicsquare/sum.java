package magicsquare;

public class sum {

	public static void main(String[] args) {
		int[][] myArray= {{23,5,6,15,18},{4,16,24,67,10},{12,54,23,76,11},{1,12,34,22,8},{81,54,32,67,33},{12,34,76,78,9}};
		
		int row=0;
		int col;
		int rowsum=0;
		int colsum=0;
		
		for(col=0;col<5;col++) {
			rowsum=rowsum+ myArray[row][col];
			for(row=0;row<5;row++)
				System.out.println("Sum"S);
		}
	

	}
}
