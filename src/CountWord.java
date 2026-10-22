import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String[] a=s.trim().split("\\s+");
		int count=0;
		for(String b:a) {
			if(b!="")
			 count++;
		}
		System.out.println(count);

	}

}
