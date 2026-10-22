import java.util.Scanner;

public class CompareVersion {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter another string");
		String c=sc.nextLine();
		sc.close();
		StringBuilder sb=new StringBuilder();
		Integer aInteger=0;
		Integer bInteger=0;
		String d[]=s.trim().split("\\.");
		String e[]=c.trim().split("\\.");
		for(int i=0;i<d.length;i++) {
			 aInteger=Integer.parseInt(d[i]);
			sb.append(aInteger.toString());
		}
		aInteger=Integer.parseInt(sb.toString());
		sb=new StringBuilder();
		for(int i=0;i<e.length;i++) {
			bInteger=Integer.parseInt(e[i]);
			sb.append(bInteger.toString());
		}
		bInteger=Integer.parseInt(sb.toString());
		if(aInteger>bInteger) {
			System.out.println(1);
		}
		if(aInteger<bInteger) {
			System.out.println(-1);
		}
		if(aInteger==bInteger) {
			System.out.println(0);
		}

	}

}
