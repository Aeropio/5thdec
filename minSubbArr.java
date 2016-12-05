public class minSubbArr{
	public static void main(String[] args) {
		int arr[] = {2, 3, 3, 1, 4, 3};
		int k = 7;
		//minimum  subarray with sum 7
		int sum=0,count=0,minCount=Integer.MAX_VALUE;
		int start = -1,end =-1;
		for(int i=0;i<arr.length;i++){
			sum = 0;
			for(int j=i;j<arr.length&&(j-i+1<minCount);j++){
				sum+=arr[j];
				if(sum==k){
					start = i;
					end = j;
					minCount = end-start+1;
					break;
				}
			}
		}
		for(int i=start;i<=end;i++){
			System.out.print(arr[i]+"  ");
		}
		
	}
}