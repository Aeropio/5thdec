import java.util.*;
public class missing{
	public static void main(String[] args) {
		int arr1[]= { 9 ,7 ,8 ,5 ,4, 6 ,2, 3 ,1};
		int arr2[]= {2 ,4 ,3 ,9 ,1 ,8 ,5 ,6};
		int sum1=0;
		int sum2 = 0;
		for(int i=0;i<arr1.length;i++){
			sum1+=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			sum2+=arr2[i];
		}
		System.out.println(sum1-sum2);
	}
}