import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int count=1;
		int left=0;
		int max=0;
		Set<Character> set=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(int right=0;right<s.length();right++) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			max=Math.max(max, right-left+1);
		}
		System.out.println(max);

	}

}
