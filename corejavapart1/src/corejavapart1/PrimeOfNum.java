package corejavapart1;

import java.util.Scanner;

public class PrimeOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prime number upto n");
		System.out.println("Enter n value");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count;
        for(int i=2;i<=n;i++)
        {
            count=0;
        	for(int j=1;j<=i;j++)
        	{
        		if(i%j==0)
        		{
        			count++;
        		}
        	}
        	if(count==2)
    		{
    			System.out.print(+i+" ");
    		}
        }
	}

}
