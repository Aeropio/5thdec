public class currLeaderA{
	public static void main(String[] args) {
		int arr[]  = { 98, 23, 54, 12, 20, 7, 27 };
		int currlead = arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>=currlead){
				currlead = arr[i];
				System.out.println("current leader is .."+currlead);
			}
		}
	}
}