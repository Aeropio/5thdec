import java.util.*;

public class LeaderArr{
	public static void main(String[] args) {
		int arr[]  = { 98, 23, 54, 12, 20, 7, 27 };
		int outArr[] = new int[arr.length];
		int index = 0;
		boolean flag = true;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				//System.out.println(arr[i]<arr[j]);
				if(arr[i]<arr[j]){
					flag = false;
					break;
				}

			}
			if(flag == true){
				outArr[index++] = arr[i];
			}
			flag = true;
		}
		for(int i:outArr){
			System.out.println(i);
		}
	}
}