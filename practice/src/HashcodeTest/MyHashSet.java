package HashcodeTest;

import java.util.HashSet;

public class MyHashSet extends HashSet<Employee> {
	private static final long serialVersionUID = 1L;
	
		
	public static void main(String[] args) {
		
		Employee e = new Employee(1,"Sachin");
		Employee e1 = new Employee(1,"Sachin");
		
		MyHashSet set = new MyHashSet();
		set.add(e);
		set.add(e1);

		System.out.println("size= "+set.size());
		System.out.println("equals= "+e.equals(e1));
		System.out.println("e-hash= "+e.hashCode()+" e1-hash= "+e1.hashCode());
		
	}
}