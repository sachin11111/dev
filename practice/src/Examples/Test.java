package Examples;

import java.util.ArrayList;

public class Test {

	public static void main(String args[]){

		/*
		 * boolean a = true; boolean b = true; boolean c = true; a=false; b=true;
		 * c=true; System.out.println(a&&b||c); a=true; b=true; c=false;
		 * System.out.println(a&&b||c); a=true; b=false; c=true;
		 * System.out.println(a&&b||c); a=false; b=true; c=false;
		 * System.out.println(a&&b||c); a=false; b=false; c=true;
		 * System.out.println(a&&b||c); System.out.println();
		 * 
		 * a=false; b=true; c=true; System.out.println(a&&(b||c)); a=true; b=true;
		 * c=false; System.out.println(a&&(b||c)); a=true; b=false; c=true;
		 * System.out.println(a&&(b||c)); a=false; b=true; c=false;
		 * System.out.println(a&&(b||c)); System.out.println();
		 * 
		 * 
		 * 
		 * ArrayList<Integer> arrayList = new ArrayList<Integer>(); arrayList.add(10);
		 * arrayList.add(9); arrayList.add(7); arrayList.add(3); arrayList.add(1);
		 * arrayList.add(4); arrayList.add(5); arrayList.add(8); arrayList.add(6);
		 * arrayList.add(2);
		 * 
		 * arrayList.forEach((x)->System.out.print(x+" ")); arrayList.remove(1);
		 * arrayList.remove(new Integer(7)); System.out.println();
		 * arrayList.forEach((x)->System.out.print(x+" ")); arrayList.remove(new
		 * Integer(1)); System.out.println();
		 * arrayList.forEach((x)->System.out.print(x+" "));
		 */

		String s1, s2, s3;

		s1 = "ABC"; // 1
		s2 = "DEF"; // 1
		s3 = new String("XYZ"); // 1+1

		s1=s2;
		s3=s1; //  s3->s1->s2->"DEF"

		System.out.println(s2 == s3);  // 
		System.out.println(s2.equals(s3)); //
		
	}
}

