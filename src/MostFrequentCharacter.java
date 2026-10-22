import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
		.map(Map.Entry::getKey).get());

	}

}
