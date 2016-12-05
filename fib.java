import java.util.*;

public class fib{
	public static void main(String[] args) {
		int st = 0;
		int fr = 1;
		int currNum = 0;
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		// ArrayList<Integer> arr = new ArrayList<Integer>();
		// arr.add(st);
		// arr.add(fr);
		int numOut = 0;
		for(int i=0;i<num-1;i++){
			currNum = st+fr;
			st=fr;
			fr=currNum;
			numOut = currNum;
		}
		System.out.println(numOut);
		
	}
}