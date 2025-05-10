package Examples;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddBigNumber {

	List<Integer> num1 = new LinkedList<>();
	List<Integer> num2 = new LinkedList<>();
	List<Integer> res = new LinkedList<>();
	int carry = 0;
	
	
	void setNumber(){
		num1 = Arrays.asList(9,9);
		num2 = Arrays.asList(9,9);
	}
	
	
	void add(){
		setNumber();
		long size1 =  num1.size();
		long size2 = num2.size()-1;
		
		
		for(long i = size1-1; i>=0; i-- ) {
			
			
				
				long temp = num1.get((int) i) + num2.get((int) size2);
				if(temp > 9) {
					
					
					int lastDigit = (int) (temp % 10);
					res.add(lastDigit + carry);
					carry = 1;
				}else {
					res.add((int) (temp + carry));
					carry = 0;
				}
				size2--;
			
		}
		
		if(carry == 1) {
			res.add(carry);
		}
		System.out.print(res);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBigNumber addBigNumber = new AddBigNumber();
		addBigNumber.add();
		
		String s = "2.2.0";
		
		 String value = s.substring(2,3);
	
		 System.out.println(value);
		String s1 = "2.3.1";
		
		 String value1 = s1.substring(2,3);
		 System.out.println(value1);
		 
	}

}
