import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.*;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class CharacterFrequencySort {
	public static void main(String[] args) {
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		LinkedHashMap<Character,Integer> count=new LinkedHashMap<>();
		StringBuilder sd=new StringBuilder();
		for(char c:s.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0)+1);
		}
		
		List<Integer> l1=new ArrayList<>(count.values());
		Collections.sort(l1,Comparator.reverseOrder());
		char c='a';
		for(Integer i:l1) {
			for(int k=0;k<i;k++) {
			c=count.entrySet().stream().filter(j->j.getValue()==i).map(Entry::getKey).findFirst().get();
			sd.append(c);
			}
			count.remove(c);
		}
		System.out.println(sd.toString());
	}

}
