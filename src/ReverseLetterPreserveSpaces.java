import java.util.Scanner;

public class ReverseLetterPreserveSpaces {

	public static void main(String[] args) {
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String[] s1=s.trim().split("\\s+");
		StringBuilder sd=new StringBuilder();
		for(int i=s1.length-1;i>=0;i--) {
			sd.append(new StringBuilder(s1[i]).reverse());
			sd.append("\s");
		}
		System.out.println(sd.toString().trim());

	}

}
