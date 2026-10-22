import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()) {
			char b=c;
			if(!Character.isDigit(c) && !Character.isWhitespace(c) && 
					!isPunctuation(c))
					{
				if(Character.isLowerCase(c)) {
					b=Character.toUpperCase(c);
				}
				if(Character.isUpperCase(c)) {
					b=Character.toLowerCase(c);
				}
				
			}
			sb.append(b);
			
		}
		System.out.println(sb.toString());

	}
	static boolean isPunctuation(char c) {
	    int type = Character.getType(c);

	    return type == Character.CONNECTOR_PUNCTUATION
	            || type == Character.DASH_PUNCTUATION
	            || type == Character.START_PUNCTUATION
	            || type == Character.END_PUNCTUATION
	            || type == Character.INITIAL_QUOTE_PUNCTUATION
	            || type == Character.FINAL_QUOTE_PUNCTUATION
	            || type == Character.OTHER_PUNCTUATION;
	}

}
