package Examples;

//Inverse of an array means if the array elements are swapped with their corresponding indices 
//and the array is called mirror-inverse if it’s inverse is equal to itself

public class CheckMirrorInverse {
	public static void main(String args[]){
		int array[] = {3,4,2,0,1};
		if (isMirrorInverse(array)) {
			printArray(array);
			System.out.println(" } is mirror inverse");
		} else {
			printArray(array);
			System.out.println(" } is not mirror inverse");
		}
	}
	
	public static boolean isMirrorInverse(int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			// if condition fails for any element
			if (array[array[i]] != i) {
				return false;
			}
		}
		// given array is mirror inverse
		return true;
	}
	
	public static void printArray(int array[]) {
		System.out.print("{");
		for (int i : array) {
			System.out.print(" "+i);
		}
	}
	
}

