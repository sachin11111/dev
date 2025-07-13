package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeAndSortArray {

	public static void main(String[] args) {
		mergeAndSort();
	}
	
	public static void mergeAndSort(){
		List<Integer> l1 = Arrays.asList(1,3,5,9,6);
		List<Integer> l2 = Arrays.asList(10,2,4,8,7);
		
		Stream<Integer> newStream = Stream.concat(l1.stream(),l2.stream());
		List<Integer> newList = newStream.sorted().collect(Collectors.toList()); 
		newList.stream().forEach(System.out::print);
	}
	
}
