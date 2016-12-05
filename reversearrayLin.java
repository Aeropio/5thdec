import java.util.*;

public class reversearrayLin{
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
		//LinkedList<Integer> list = new LinkedList<Integer>();
		 LinkedList<Integer> list = new LinkedList<Integer>();
		 for(int i:intArr){
		 	list.add(i);
		 }

		for(int i=0;i<numRots;i++){
			//System.out.println("adding elements");
			System.out.println("numRots is ....."+(numRots-1));
			list.addLast(list.getFirst());
			//System.out.println("2nd print......");
			list.remove(0);
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}