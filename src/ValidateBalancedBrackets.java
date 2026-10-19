import java.util.Scanner;
import java.util.Stack;

public class ValidateBalancedBrackets {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack<Character> st=new Stack<>();
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='(' || s.charAt(j)=='{' ||  s.charAt(j)=='[') {
				st.push(s.charAt(j));
			}
			else {
			if(st.isEmpty()){
				System.out.println("VALID");
				return;
			}
			char c=st.pop();
			if(c=='(' && s.charAt(j)!=')') {
				System.out.println("INVALID");
			    return;
			}
			if(c=='{' && s.charAt(j)!='}') {
				System.out.println("INVALID");
			    return;
			}
			if(c=='[' && s.charAt(j)!=']') {
				System.out.println("INVALID");
			    return;
			}
		}
		

	}
		if(st.isEmpty()) {
			System.out.println("VALID");
		}
		else {
			System.out.println("INVALID");
		}
		System.out.println(st);
	}}


