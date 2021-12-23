package practice;
import java.util.Scanner;
public class Reverse {
      public static void main(String[] args) {
    	  int n,rev=0,d;
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter the number:");
    	  n=sc.nextInt();
    	  while(n>0)
    	  {
    		  d=n%10;
    		  rev=rev*10+d;
    		  n=n/10;
    	  }
    	  System.out.println("Reverse number is : "+rev);
      }
}
