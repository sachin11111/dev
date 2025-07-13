package Examples;

import java.util.Arrays;
import java.util.Comparator;

public class FindMaximumProduct {

	public static void main(String[] args) {
		findMaximumProduct();
	}
	
	public static void findMaximumProduct(){
		Integer[] array1 = {1, 8, 3, 4, 5};
		
		Integer product = Arrays.stream(array1).sorted(Comparator.reverseOrder()).limit(2).reduce(1, (x, y) -> x*y);
		System.out.println(product);
	}

}
