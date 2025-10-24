package com.example.demo.samples;

public class ArrayTest{
	public static void main(String[] args) {
//		Integer[] array = new Integer[] {1,3,2,6,1,5,2};
//		printList(array);
//		removeDuplicate(array);
//		//Arrays.sort(a);
//		printList(array);
		
		 
		
		int[] array = new int[] {1,3,2,6,1,5,2};
		printListInt(array);
		//removeDuplicateElements(array, array.length);
		//insertionSort(array);
		//bubbleSort(array);
		quickSort(array, 0, array.length-1);
		printListInt(array);
		
		
	}
	
	public static void printListInt(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
	
	public static void bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	}
	
	public static void insertionSort(int[] array) {
	    for (int i = 1; i < array.length; i++) {
	        int current = array[i];
	        int j = i - 1;
	        while(j >= 0 && current < array[j]) {
	            array[j+1] = array[j];
	            j--;
	        }
	        array[j+1] = current;
	    }
	}
	
	public static void selectionSort(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        int min = array[i];
	        int minId = i;
	        for (int j = i+1; j < array.length; j++) {
	            if (array[j] < min) {
	                min = array[j];
	                minId = j;
	            }
	        }
	        // swapping
	        int temp = array[i];
	        array[i] = min;
	        array[minId] = temp;
	    }
	}
	
	public static void printList(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
	
	static int partition(int[] array, int begin, int end) {
	    int pivot = end;
	    int counter = begin;
	    
	    for (int i = begin; i < end; i++) {
	        if (array[i] < array[pivot]) {
	            int temp = array[counter];
	            array[counter] = array[i];
	            array[i] = temp;
	            counter++;
	        }
	    }
	    int temp = array[pivot];
	    array[pivot] = array[counter];
	    array[counter] = temp;

	    return counter;
	}

	public static void quickSort(int[] array, int begin, int end) {
	    if (end <= begin) return;
	    int pivot = partition(array, begin, end);
	    quickSort(array, begin, pivot-1);
	    quickSort(array, pivot+1, end);
	}
	
	public static Integer[] removeDuplicate(Integer[] array) {
		Integer test = 0;
		Integer[] testArray = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			test = array[i];
			if(test!=null) {
				testArray[i]=test;
			}
			for (int j = i+1; j < array.length; j++) {
				if(test == array[j])
					array[j] = null;
			}
		}
		
		return testArray;
	}
	
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
	
}