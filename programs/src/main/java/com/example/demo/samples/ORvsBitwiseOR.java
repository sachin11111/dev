package com.example.demo.samples;

public class ORvsBitwiseOR {
	//Normal operators are short-circuiting        	(x != 0) && (1/x > 1)   SAFE
	//Bitwise operators are not short-circuiting    (x != 0) &  (1/x > 1)   NOT SAFE
	
	public static void main(String[] args) {
		//short-circuiting        (x != 0) && (1/x > 1)   SAFE
		//not short-circuiting    (x != 0) &  (1/x > 1)   NOT SAFE

		int index = 0;
        boolean flag = true;
        boolean reg1 = false, reg2;
        
        reg2 = (flag | ((index++) == 0));
        reg2 = (reg1 | ((index += 2) > 0));
        
        //here answer would be 3 since BITWISE-OR | is not short-circuiting so it will evaluate all the conditions and index will be incremented
        System.out.println(index);
        System.out.println(reg2);
       
		index = 0;
        flag = true;
        reg1 = false; reg2 = false;
        
        reg2 = (flag || ((index++) == 0));
        reg2 = (reg1 || ((index += 2) > 0));
  
        //here answer would be 2 since OR - || is not short-circuiting so it will not evaluate all the conditions
        System.out.println(index);
        System.out.println(reg2);
	}
}
