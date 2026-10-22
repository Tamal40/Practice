import java.util.Scanner;

public class CountPalidromicSubstring {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int count=0;
		int flag=0;
		String d="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String c=s.substring(i, j);
				if(c.length()==1) {
					count++;
					continue;
				}
				
				int k=c.length()-1;
				d=c.toLowerCase();
				for( int l=0;l<d.length();l++) {
					if(d.charAt(l)!=d.charAt(k)) {
						flag=1;
						break;
					}
					k--;
				}
				if(flag==0) {
					count++;
					System.out.println(c);
				}
					
			  flag=0;
				
			}
		}
		System.out.println(count);

	}

}
