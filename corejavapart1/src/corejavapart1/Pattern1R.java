package corejavapart1;

import java.util.Scanner;

public class Pattern1R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of rows");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int k=1;
     for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=i;j++)
    	  {

    		  System.out.print(k+" ");
    		  k++;
    		  
    	  }
    	  System.out.println();
      }
      /*for(int i=0;i<n;i++)
      {
    	  for(int j=2*(n-i);j>=0;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=0;j<=i;j++)
    	  {
    		  System.out.print("*");
    	  }
      }*/
	}

}
