public class binarySearch{
	public static void main(String[] args) {
		int arr[] = {55,66,78,92,99,102};
		//search for element at an index in a sorted array
		int res = binarySearchNum(99,arr);
		System.out.println(res);

	}
	public static int binarySearchNum(int num,int arr[]){
		int start = 0,end = arr.length-1,mid=0;
		while(start<=end){
			mid = (start+end)/2;
			if(arr[mid]==num){
				return mid;
			}
			else if(num<arr[mid]){
				end = mid-1;
			}
			else{
				start = mid+1;
			}
		}
		return -1;
	}
}