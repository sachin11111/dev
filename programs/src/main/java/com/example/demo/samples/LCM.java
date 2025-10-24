package com.example.demo.samples;

public class LCM {
	//Least common multiple
	public void printLCM(int num1, int num2) {
		// we initially set LCM to the largest of the two numbers.
		// This is because, LCM cannot be less than the largest number.
		int lcm = num1 > num2 ? num1 : num2;

		while (true) {
			// we check if LCM perfectly divides both n1 and n2 or not.
			if (lcm % num1 == 0 && lcm % num2 == 0) {
				System.out.println("The LCM of "+num1+" and "+num2+" is "+lcm+".");
				break;
			}
			++lcm;
		}

	}

	public static void main(String[] args) {
		new LCM().printLCM(10, 15);
		new LCM().printLCM(30, 40);
		new LCM().printLCM(7, 8);
	}
}
