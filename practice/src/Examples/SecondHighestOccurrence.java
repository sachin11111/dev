package Examples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestOccurrence {

    public static void main(String[] args) {
        String[] listint = {"7","2","2","2","4","4","4","4","1"};
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(Arrays.asList(listint));

        //Highest even integer
        OptionalInt intval =  arrayList.stream().filter(a -> Integer.parseInt(a) % 2==0).mapToInt(a -> Integer.parseInt(a)).max();
        System.out.println(intval);

        //Highest odd integer
        OptionalInt intval1 =  arrayList.stream().filter(a -> Integer.parseInt(a) % 2==1).mapToInt(a -> Integer.parseInt(a)).max();
        System.out.println(intval1);

        //Count the occurrences of each
        Map<String, Long> counted = arrayList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(counted);

        //second largest from list
        int[] list = {7,2,2,2,4,4,4,4,1};
        //Sort
        List<Integer > sortedList = Arrays.stream(list).sorted().mapToObj(x -> new Integer(x)).distinct().collect(Collectors.toList());
        System.out.println(sortedList);
        if (sortedList.size()>2) {
            System.out.println("second highesr number is "+sortedList.get((sortedList.size()-2)));
        }
        
        
        ///// Second highest odd occurred
        List<Integer> listInts = Arrays.asList(1,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5,5,5);
        
        Map<Integer, Long> map = listInts.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Long> value = map.values().stream().filter(x -> x%2==1).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        Optional<Map.Entry<Integer,Long>> answer = map.entrySet().stream().filter(y -> y.getValue()==value.get()).findFirst();
        System.out.println("second highesr number is "+answer.get().getKey());
    }
}
