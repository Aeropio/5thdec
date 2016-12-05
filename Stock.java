import java.util.*;

public class Stock{
	public static void main(String[] args) {
		int arr[] = {100,80,120,130,70,60,100,125};
		int minBuy = Integer.MAX_VALUE;
		int maxprofit = 0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]<minBuy){
				minBuy = arr[i];
			}
			else if(arr[i]-minBuy>maxprofit){
				maxprofit = arr[i]-minBuy;
			}

			
		}
		System.out.println(maxprofit);
	}
}