//import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;
public class NumbersHomework {
	public static void main(String[] args) {
		/*int [] array = {1, 2, 3, 4, 5};

		int i = 0;

		for (i=0; i<array.length/2; i++) {
			int temp = array[array.length-i-1];
			array[array.length-i-1]= array[i];
			array[i]= temp;
			System.out.println(array[i]);
		}*/
		// My sister helped me with this part 
		System.out.println("Enter a number string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char []array = s.toCharArray();
		int arraylength = array.length;
		char [] original = Arrays.copyOf
				(array, array.length);
		//She also showed me this loop, 
		//and it makes a lot of sense!
		for (int i= 0; i< arraylength /2; i++) {
			char temp = array [i];
			array [i]= array [arraylength-i-1];
			array [arraylength-i-1] = temp;
		}
		System.out.println("First array: "+ 
		Arrays.toString(original));
		System.out.println("Second Array: "+
		Arrays.toString(array));
	}
	
}


