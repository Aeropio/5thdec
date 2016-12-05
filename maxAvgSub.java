import java.util.*;
public class maxAvgSub{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.nextLine());
		int arr[] = {11,-8,16,-7,24,-2,3};

		int start = 0,end = arr.length;
		//boolean flag = true;
		int sum=0,maxsum=0,index=0;

		for(int i=0;i<k;i++){
			sum+=arr[i];
		}
		//int index=0;
		for(int i=k;i<arr.length;i++){
			sum = sum+arr[i]-arr[index++];
			if(sum>maxsum){
				maxsum = sum;
			}
		}



		
		System.out.println(maxsum);
	}
}