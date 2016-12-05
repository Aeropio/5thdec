import java.util.*;
// Given an array and a positive integer k, rotate the array k times.
// Example:
// Array:  1 2 3 4 5
// k: 1
// Output: 2 3 4 5 1
// k: 2
// Output: 3 4 5 1 2
// k: 3
// Output: 4 5 1 2 3
//=============================================================================================//
// Efficient Solution: Using Array Reversal
// 1. Reverse the array elements from 0 to k-1.
// 2. Reverse the array elements from k to array.length-1.
// 3. Reverse the whole array.
public class reverseArr{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numRots = Integer.parseInt(scan.nextLine());
		String in = scan.nextLine();
		String arr[] = in.split(" ");
		int intArr[] = new int[arr.length];
		int index=0;
		for(String s:arr){
			intArr[index++] = Integer.parseInt(s);
		}
		
	}
}