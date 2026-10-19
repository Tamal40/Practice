import java.util.Scanner;

public class PalindromeAfterRemovingCharacter {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)==s.charAt(right)) {
				left++;
				right--;
			}
			else {
				if(isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1)) {
					System.out.println("YES");
					return;
				}
				else {
					System.out.println("NO");
					return;
				}
			}
		}

	}

	private static boolean isPalindrome(String s, int left, int right) {
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
	}
		return true;

}
}
