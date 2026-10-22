import java.util.Scanner;

public class CountCharacterType {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int lower=0,upper=0,digit=0,space=0,special=0;
		for(char c:s.toCharArray()) {
			if(Character.isLowerCase(c)) {
				lower++;
			}
			else if(Character.isUpperCase(c)) {
				upper++;
			}
			else if(Character.isDigit(c)) {
				digit++;
			}
			else if(Character.isWhitespace(c)) {
				space++;
			}
			else {
				special++;
			}
		}
		System.out.println(upper+" "+lower+" "+digit+" "+ space+" "+ special);

	}

}
