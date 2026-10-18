import java.util.Scanner;

public class RemoveAdjajentDuplicate {

	public static void main(String[] args) {
		 System.out.println("Enter a string");
		 Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		StringBuilder sd=new StringBuilder(s);
		int i=1;
		while(i<sd.length()) {
			if(i>0 && s.charAt(i)==sd.charAt(i-1) && i<sd.capacity()) {
				sd.deleteCharAt(i);
				sd.deleteCharAt(i-1);
				i--;
				continue;
			}
			if(i>0 && sd.charAt(i)==sd.charAt(i-1) && i<sd.capacity()) {
				sd.deleteCharAt(i);
				sd.deleteCharAt(i-1);
				i--;
				continue;
			}
			i++;
		}
		if(sd.isEmpty()) 
			System.out.println("EMPTY");	
		else
		   System.out.println(sd.toString());

	}

}
