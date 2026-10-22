import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter a character");
		String c=sc.nextLine();
		sc.close();
		StringBuilder sb=new StringBuilder();
		for(char d:s.toCharArray()) {
			if(d!=c.charAt(0))
				sb.append(d);
		}
		System.out.println(sb.toString());
		

	}

}
