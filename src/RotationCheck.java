import java.util.Scanner;

public class RotationCheck {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter another string");
		String c=sc.nextLine();
		sc.close();
		StringBuilder sb=new StringBuilder();
		if(s.length()!=c.length()) {
			System.out.println("NO");
			return;
		}
		if(sb.append(s).append(s).toString().contains(c)){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
