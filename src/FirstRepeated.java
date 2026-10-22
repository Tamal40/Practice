import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeated {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int flag=0;
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			if(m.getValue()>1) {
				System.out.print(m.getKey());
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("NONE");
		}

	}

}
