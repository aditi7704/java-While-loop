package ItsAdii;
import java.util.*;
//print numbers form 1 to n:
public class P1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}
}
