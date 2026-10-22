import java.util.Scanner;

public class DecodeRunLengthText {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int count=0;
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<s.length();i=i+2) {
			count=0;
			if(Character.isDigit(s.charAt(i))) {
				count=Character.digit(s.charAt(i), 10);
				for(int j=0;j<count;j++) {
					sb.append(s.charAt(i-1));
				}
			}
			else {
			sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
