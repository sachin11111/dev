package PrintPatterns;

public class TrickyPatterns {

	
	public static void main(String[] args) {
		trickyPattern(6);
	}


//	input: n = 6
//	output:		
//	1
//	7 2
//	12 8 3
//	16 13 9 4
//	19 17 14 10 5
//	21 20 18 15 11 6	
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
						firstNumber = firstNumber + (n - i+2);
					}
					System.out.print(firstNumber);
					rowNumber = firstNumber;
					rowDiff = n + 1 - i;
				} else {
					rowNumber = rowNumber - rowDiff;
					rowDiff++;
					System.out.print(" "+rowNumber);
				}
				
			}
			
			System.out.println();		
		}
	}
	
}
