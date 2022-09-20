/* 
Problem Statement
An array of 5 string is given where each string contains 2 characters, Now you have to sort these strings, like in a dictionary.
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
      Scanner sc = new Scanner(System.in);
      String []arr = new String[5];
      for(int i=0;i<5;i++){
        arr[i]= sc.next();
      }
      Arrays.sort(arr);
      for(int i=0;i<5;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println("");
	}
}