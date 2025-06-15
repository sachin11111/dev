package PrintPatterns;

public class StarPatterns {	
	
	public static void main(String[] args) {
		
		int level = 10;
		
		pattern1(level);
		pattern2(level);
		pattern3(level);
	}
	
	//	Pattern 1
	//
	//	*
	//	**
	//	***
	//	****
	//	*****
	public static void pattern1(int level) {
		System.out.println("Pattern 1");
		System.out.println();
		for (int i = 1; i <= level; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("=====================");
	}
	
	//	Pattern 2
	//
	//	*****
	//	****
	//	***
	//	**
	//	*
	public static void pattern2(int level) {
		System.out.println("Pattern 2");
		System.out.println();
		for (int i = level; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("=====================");
	}

	//	Pattern 3
	//
	//	*****
	//	*   *
	//	*   *
	//	*   *
	//	*****
	public static void pattern3(int level) {
		System.out.println("Pattern 3");
		System.out.println();
		for (int i = 1; i <= level; i++) {
			for (int j = 1; j <= level; j++) {

				if (i == 1 || i == level || j ==1 || j == level) {
					System.out.print("*");					
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("=====================");
	}
	
}
