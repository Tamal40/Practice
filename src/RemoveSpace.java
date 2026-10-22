import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

	}

}
