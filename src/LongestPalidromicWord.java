import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalidromicWord {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String[] a=s.trim().split("\\s+");
		LinkedHashMap<String,Integer> count=new LinkedHashMap<>();
		int i=0;int j=0;int flag=0;
		String d="";
		for(String b:a) {
			flag=0;
			i=0;j=b.length()-1;
			d=b.toLowerCase();
			for( i=0;i<d.length();i++) {
				if(d.charAt(i)!=d.charAt(j)) {
					flag=1;
					break;
				}
				j--;
			}
			if(flag==0) {
				count.put(b, b.length());
			}
		}
		if(count.isEmpty()) {
			System.out.println("NONE");
		}
		else {
		System.out.println(count.entrySet().stream().
				max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).get());
		}

	}

}
