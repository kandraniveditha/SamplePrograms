//23.Program to print the sum of all the elements of an array
public class ArrayAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {1, 2, 3, 4, 5};  
	        int sum = 0;  
	        //Loop through the array to calculate sum of elements  
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
	        System.out.println("Sum of all the elements of an array: " + sum);  
	}

}
