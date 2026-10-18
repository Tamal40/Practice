import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Scanner;

public class NonRepeatingFirst {
	
	public static void main(String[] args) {
	
    System.out.println("Enter a string");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	sc.close();
	LinkedHashMap<Character,Integer> count=new LinkedHashMap<>();
	
	for(char c:s.toCharArray()) {
		count.put(c, count.getOrDefault(c, 0)+1);
	}
	for(Map.Entry<Character,Integer> entry:count.entrySet()) {
		if(entry.getValue()==1) {
			System.out.println(entry.getKey());
			return;
		}
	}
	System.out.println("None");
	}
	

}
