import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithKDistinct {

	public static void main(String[] args) {
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter a integer");
		int k=sc.nextInt();
		sc.close();
		if(k==0) {
			System.out.println(0);
			return;
		}
		int left=0;
		int max=0;
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i),
					map.getOrDefault(s.charAt(i), 0)+1);
			while(map.size()>k) {
				map.put(s.charAt(left),
						map.get(s.charAt(left))-1);
				if(map.get(s.charAt(left))==0) {
					map.remove(s.charAt(left));
				}
				left++;
			}
			max=Math.max(max, i-left+1);


		}
		System.out.println(max);
		
		
		

		
	}

}
