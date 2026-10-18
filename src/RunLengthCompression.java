import java.util.Scanner;

public class RunLengthCompression {

	public static void main(String[] args) {
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int count=1;
		StringBuilder sd=new StringBuilder();
		int i=0;
		for(i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1))
				count++;
			else {
				sd.append(s.charAt(i-1)).append(count);
				count=1;
			}		
		}
		sd.append(s.charAt(i-1)).append(count);
		System.out.println(sd.toString());
	}

}
