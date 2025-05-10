package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppUtil2 {
	
	static int  gcd(int a, int b) { 
		if (b == 0)
			return a; 
	    else
	        return gcd(b, a % b); 
	} 
	  
	static int  lcm(int a, int b) { 
		return (a*b)/gcd(a, b); 
	}
	
	static void increment(int []i) {
		i[i.length-1]++;
	}
	
	public interface Addable{
		public int add(int a, int b);
	}
		
	
	public static int solution2(int[] A) {
		// write your code in Java SE 8
		HashSet<Integer> dups = new HashSet<Integer>();
		int elem = -1;

		for (int i = 0; i < A.length; i++) {
			if (dups.add(A[i])) {
				elem = A[i];
			}
		}
		return elem;
	}
	
	public static int solution(int[] A) {
		// write your code in Java SE 8
		int elem = 0;

		for (int i = 0; i < A.length; i++) {
			elem ^= A[i];
		}
		return elem;
	}
	
	public static void main(String args[]){
		int[] ar = { 1, 2, 3, 4, 5 };
		
		System.out.println(solution(new int[] { 9, 7, 9, 3, 9, 3, 9 }));
		
	    int[] result = new int[ar.length];
	    System.arraycopy(ar, 2, result, 0, ar.length - 2);
	    result[ar.length - 1] = ar[0];
	    result[ar.length - 2] = ar[1];
	    
	    System.out.println(Arrays.toString(result));
	    
	    int[] s = {1};
	    increment(s);
	    System.out.println(s[s.length-1]);	    
	    
	    int gcd = gcd(12, 3);
	    
	    System.out.println(gcd);
		/*Addable addable = (a,b)->(a+b);
		int result = addable.add(50, 100);
		System.out.print(result);*/
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(40);
		arrayList.add(10);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(30);
		arrayList.add(30);
		
		Iterator<Integer> it = arrayList.iterator();
		while(it.hasNext()) {
			it.remove();
			it.next();
		}
		
		
		//arrayList.stream().distinct().forEach((a)->System.out.print(a+" "));
		arrayList.stream().distinct().sorted().forEach((a)->System.out.print(a+" "));
		arrayList.stream().map(x->x*x).forEach(a->System.out.print(a+" "));

		String ss = "sachin";
		char[] arra = ss.toCharArray();
		char[] sss= new char[6];
		
		for (int i = arra.length-1; i >= 0 ; i--) {
			sss[ss.length()-1-i]=arra[i];
		}
		
		System.out.println(ss);
		Function<Integer, Double> dsad = new Function<Integer, Double>() {
			@Override
			public Double apply(Integer t) {
				return t*t*1.2;
			}
		}; 	
		
		
		arrayList.stream().filter(x->x%2==0);
		
		Predicate<Integer> asdasd = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				
				return false;
			}
		};
		
		Collections.sort(arrayList,(a,b)->a.compareTo(b));
		arrayList.forEach((a)->System.out.print(a+" "));

		/*	
		ForEach takes Consumer input which is nothing but functional interface
  		Consumer<Integer> consumerFunction = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				
			}
		};*/
		
		
		int i = 10_00;
		int j = 10_00_00;
		int k = i+j;
		
		System.out.println(k);
		
		Map<String, String> map = new HashMap<String, String>();
		
		
	}
}

