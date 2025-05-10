package Examples;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.TreeSet;

public class HeteroObjects {

	public static void main(String args[]){

		ArrayList<Object> sdsad = new ArrayList<>();
		sdsad.add(Optional.ofNullable(null));
		sdsad.add(null);
		
		try {
			LinkedHashSet<Object> ns = new LinkedHashSet<>();
			ns.add(new Thread());
			ns.add(new CompilationTest());			
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

		try {
			TreeSet<Object> set = new TreeSet<>();
			set.add(new Thread());// not allowed as it does not implement comparable
			set.add(new CompilationTest());
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
}

