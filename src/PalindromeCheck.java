import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(!Character.isWhitespace(c)) {
				sb.append(Character.toLowerCase(c));
			}
		}
		int flag=0;
		int i=0;int j=sb.toString().length()-1;
		for( i=0;i<sb.toString().length();i++) {
			if(sb.toString().charAt(i)!=sb.toString().charAt(j)) {
				flag=1;
				break;
			}
			j--;
		}
		if(flag==1) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}

	}

}
