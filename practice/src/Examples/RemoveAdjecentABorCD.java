package Examples;

public class RemoveAdjecentABorCD {
	public static void main(String args[]){
		
		String s = test("ABDA");
		System.out.println("ABDA----"+s);
		
		s = test("CABDA");
		System.out.println("CABDA----"+s);

		s = test("ABDCADCBCA");
		System.out.println("ABDCADCBCA----"+s);
		
		s = test("DCAB");
		System.out.println("DCAB----"+s);
		
		s = test("ACBDACBD");
		System.out.println("ACBDACBD----"+s);
		
		
	}
	
	public static String test(String S) {
		boolean found;
		String temp = S;
		int c = (int)'C';
		
		while(true) {
			found = false;
			S = temp;
			for (int i = 0; i < S.length()-1; i++) {
				if(((int)S.charAt(i) < c && (int)S.charAt(i+1) < c) || ((int)S.charAt(i) >= c && (int)S.charAt(i+1) >= c)) {
					found = true;
					temp = S.replace(S.substring(i, i+2), "");
				}
				if(found) break;
			}
			
			if(!found) break;
		}
		return temp;
	}
	
}

