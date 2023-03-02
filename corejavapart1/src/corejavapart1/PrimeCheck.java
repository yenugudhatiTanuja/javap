package corejavapart1;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number to check");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
        
        	if(n%i==0)
        	{
        		count++;
        	}
        }
        if(count==2)
        {
        	System.out.println(+n+"-----> prime");
        }
        else
        {
        	System.out.println(+n+"-----> not prime");
        }
	}

}
