import java.util.*;
@SuppressWarnings("unchecked")
// For example, if arrayA = {-3, 5, INVALID_NUM, 7, INVALID_NUM, 10, INVALID_NUM, 11, INVALID_NUM}
//  and arrayB = {-1, 2, 6, 12}
// then arrayS should be modified to array - {-3, -1, 2, 5, 6, 7, 10, 11, 12}

public class MergeArrays{
	public static void main(String[] args) {
		Integer arrayA[] = {-3, 5, Integer.MAX_VALUE, 7, Integer.MAX_VALUE, 10, Integer.MAX_VALUE, 11,Integer.MAX_VALUE};
		Integer arrayB[] = {-3, -1, 2, 5, 6, 7, 10, 11, 12};
		//remove duplicates of one array from other array
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr1.addAll(Arrays.asList(arrayA));
		arr2.addAll(Arrays.asList(arrayB));
		arr2.removeAll(arr1);
		int index=0;
		for(int i=0;i<arr1.size();i++){
			if(arr1.get(i)==Integer.MAX_VALUE){
				arr1.set(i,arr2.get(index++));
			}
		}
		Collections.sort(arr1);
		for(int i:arr1){
			System.out.print(i+"  ");
		}
		
	}
}