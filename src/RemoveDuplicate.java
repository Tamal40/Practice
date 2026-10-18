import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		StringBuilder sd=new StringBuilder();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(Character c:set) {
			sd.append(c);
		}
		System.out.println(sd.toString());

	}

}
