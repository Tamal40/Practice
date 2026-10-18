import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String[] s1=s.trim().split("\\s+");
		StringBuilder sd=new StringBuilder();
		for(String s2:s1) {
			sd.append(new StringBuilder(s2).reverse());
			sd.append("\s");
		}
		System.out.println(sd.toString().trim());

	}

}
