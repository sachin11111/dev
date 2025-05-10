package Examples;

public class AddTwoVeryLongNumbers {
	public static void main(String args[]){
		String number1 = "99999999999999999999999999999999999999999999999999999999999999999999999999";
		String number2 = "99999999999999999999999999999999999999999999999999999999999999999999999999";
		String sum = add(number1,number2);
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(sum);
	}
	
	public static String add(String a,String b) {
		String sum = "";
		int s =  a.length() >= String.valueOf(Integer.MAX_VALUE).length()-1 ? String.valueOf(Integer.MAX_VALUE).length()-1 : a.length();//split counter

		String aa;
		String bb;
		String imdResult;
		int carry = 0;
		
		while(s!=0) {
			aa = a.substring(a.length()-s,a.length());
			bb = b.substring(b.length()-s,b.length());
			
			imdResult = String.valueOf((Integer.parseInt(aa) + Integer.parseInt(bb) + carry));
			carry = imdResult.length() > s ? 1 : 0;
			imdResult = imdResult.length() > s ? imdResult.substring(1, imdResult.length()) : imdResult;
			
			a = a.substring(0,a.length()-s); 
			b = b.substring(0,b.length()-s);
			
			sum = imdResult + sum;
			
			if(a.length() < s)
				s = a.length();				
							
			if(s==0) {
				if(carry > 0) sum = carry + sum;
				break;
			}
		}
		
		return sum;
	}
	
}

