import java.util.Scanner;

public class AnagramCheck {
	
	public static void main(String[] args) {
	
	 System.out.println("Enter a string");
	 Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	 System.out.println("Enter another string");
	String s2=sc.nextLine();
	sc.close();
	int[] count=new int[256];
	for(char c:s1.trim().toLowerCase().toCharArray()) {
		if(c!='\s')
		  count[c]++;
	}
	for(char c:s2.trim().toLowerCase().toCharArray()) {
		if(c!='\s')
		  count[c]--;
	}
	for(int i=0;i<count.length;i++) {
		if(count[i]!=0) {
			System.out.println("NO");
			return;
		}
	}
	System.out.println("YES");
		
	}

}
