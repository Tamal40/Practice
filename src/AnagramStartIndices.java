import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramStartIndices {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter the pattern");
		String p=sc.nextLine();
		sc.close();
		Map<Character, Integer> pMap = new HashMap<>();
		Map<Character, Integer> windowMap = new HashMap<>();
		int left=0;
		int flag=0;
		for(char c:p.toCharArray()) {
			pMap.put(c, pMap.getOrDefault(c, 0)+1);
		}
		for(int i=0;i<s.length();i++) {
			windowMap.put(s.charAt(i), 
					windowMap.getOrDefault(s.charAt(i), 0)+1);
			if(i-left+1>p.length()) {
			windowMap.put(s.charAt(left), 
				windowMap.get(s.charAt(left))-1);
			if(windowMap.get(s.charAt(left))==0) {
				windowMap.remove(s.charAt(left));
			}
			left++;
			}
			if(i-left+1==p.length() && windowMap.equals(pMap)) {
				flag=1;
				System.out.println(left);
			}	
		}
		if(flag==0) {
			System.out.println("NONE");
		}


	}

}
