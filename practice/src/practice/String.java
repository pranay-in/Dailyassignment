
package practice;
import java.util.Scanner;
public class String {
	public static void main(String[] args) {
		String result="";
		System.out.println("enter a string: ");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			result +=ch[i];
		}
		System.out.println("result string is: +result");
	}

}
