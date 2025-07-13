package Examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {

	public static void main(String[] args) {
		findCommonElementsArrayList();
		findCommonElementsArrays();
	}
	
	public static void findCommonElementsArrayList(){
		Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};
        Set set1 = new HashSet<>(Arrays.asList(array1));
        Set set2 = new HashSet<>(Arrays.asList(array2));
        set1.retainAll(set2); // keeps only common elements
        System.out.println("Common elements: " + set1);
	}
	
	public static void findCommonElementsArrays(){
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        // convert to INTEGER
        Integer[] boxedArray1 = Arrays.stream(array1).boxed().toArray(Integer[]::new);
        Integer[] boxedArray2 = Arrays.stream(array2).boxed().toArray(Integer[]::new);

        Set set1 = new HashSet<>(Arrays.asList(boxedArray1));
        Set set2 = new HashSet<>(Arrays.asList(boxedArray2));
        set1.retainAll(set2); // keeps only common elements
        System.out.println("Common elements: " + set1);
	}

}
