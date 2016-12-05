import java.util.*;
public class maxSubstr{
	public static void main(String[] args) {
		String str = "ABCDABDEFGCABD";
		
		ArrayList<ArrayList<Character>> outer = new ArrayList<ArrayList<Character>>();
		ArrayList<Character> inner = new ArrayList<Character>();
		for(int i=0;i<str.length();i++){
			
			if(!inner.contains(str.charAt(i))){
				inner.add(str.charAt(i));
			}
			
			else {
				System.out.println("inner is "+inner);
				outer.add(inner);
				System.out.println("outer is .."+outer);
				
				//inner.clear();
				inner = new ArrayList<Character>();
				inner.add(str.charAt(i));
			}

		}
		outer.add(inner);
		//System.out.println("final outer is .."+outer);
		//sort accoding to size
		int maxsize=0,maxindex=0;
		for(int i=0;i<outer.size();i++){
			//System.out.println(outer.get(i).size());
			if(outer.get(i).size()>maxsize){
				maxsize = outer.get(i).size();
				maxindex = i;
			}
		}
		System.out.println(maxsize);
		System.out.println(outer.get(maxindex));
	}
}