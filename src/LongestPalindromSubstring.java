import java.util.Scanner;

public class LongestPalindromSubstring {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int bestLength=0;
		int max=1;int length=0;
		int left,right;
		for(int i=0;i<s.length();i++) {
			left=i;
			right=i;
			while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
				length=right-left+1;
				if(length>max || length==max && left<bestLength) {
					max=length;
					bestLength=left;
				}
				
				left--;
				right++;
				
			}
			
			left=i;
			right=i+1;
			while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
				length=right-left+1;
				if(length>max || length==max && left<bestLength) {
					max=length;
					bestLength=left;
				}
				
				left--;
				right++;
				
			}
		}
		System.out.println(s.substring(bestLength, bestLength+max));
			

	}

}
