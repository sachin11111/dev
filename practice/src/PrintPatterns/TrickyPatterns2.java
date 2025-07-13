package PrintPatterns;

public class TrickyPatterns2 {

	
	public static void main(String[] args) {
		trickyPattern(6);
	}


//	Input: n = 6
//	Output:		
//	1
//	6 1
//	10 5 1
//	13 8 4 1
//	15 10 6 3 1
//	16 11 7 4 2 1	
	private static void trickyPattern(int n) {
		int firstNumber = 0;
		int rowNumber = 0;
		int rowDiff = n;
		
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= i; j++) { 
			
				if (j == 1) {
					if (i==1) {
						firstNumber = 1;
					} else { 
						firstNumber = firstNumber + (n-i+1);
					}
					System.out.print(firstNumber);
					rowNumber = firstNumber;
					rowDiff = n-1;
				} else {
					rowNumber = rowNumber - rowDiff;
					rowDiff--;
					System.out.print(" "+rowNumber);
				}
				
			}
			
			System.out.println();		
		}
	}
	
}
