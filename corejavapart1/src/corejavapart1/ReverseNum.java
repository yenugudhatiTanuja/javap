package corejavapart1;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int r;
       int rev=0;
       while(n>0)
       { 
    	  // r=n%10;
    	   rev=rev*10+(n%10);
    	   n=n/10;
       }
       System.out.println(rev);
	}

}
