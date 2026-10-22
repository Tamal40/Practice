import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String[] a=s.trim().split("\\s+");
		LinkedHashMap<String,Integer> count=new LinkedHashMap<>();
		for(String b:a) {
			count.put(b, b.length());
		}
		System.out.println(count.entrySet().stream().
				max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).get());
	}

}
