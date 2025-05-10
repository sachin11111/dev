package Examples;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

import java.util.Optional;
import java.util.Arrays;
//import java.utils.List;
//import java.util.Math.*;

class MissingNumber {
 
 /*
     find the missing number in int array of non-duplicating numbers from 1 to 'n'.
     
     input : array of integers
     returns optional for missing number. empty if error occurs 
 */
 public static Optional<Integer> findMissingNumber(int[] arr){
     Optional<Integer> missingNumberOptional = Optional.empty();
     
     if(arr == null || arr.length == 0){
         return Optional.empty();
     }
     
     //Step 1 get summation for the array
     
     int n = 0;
     int sum = 0;
     for(int i: arr){
         n++;
         sum+=i;
     }
     
     //Step 2 get ideal summation
     
     int idealsummation = (Integer) (n+1)*(n+2)/2;
     
     //step 3 missing number
     
     missingNumberOptional = Optional.of(idealsummation - sum);
     
     return missingNumberOptional;
     
 }
 
 public static void main(String[] args) {
     //happy path
     int[] testArray = new int[] {3, 7, 6, 4, 1, 2};
     
     Optional<Integer> missingNumber = findMissingNumber(testArray);
     
     missingNumber.ifPresent(i->System.out.println(i));
     
     
     //zero count
     int[] testArray2 = new int[] {};
     
     Optional<Integer> missingNumber2 = findMissingNumber(testArray2);
     
     missingNumber2.ifPresent(System.out::println);
     
     
     //null check
     int[] testArray3 = null;
     
     Optional<Integer> missingNumber3 = findMissingNumber(testArray3);
     
     missingNumber3.ifPresent(System.out::println);
     
 }
}