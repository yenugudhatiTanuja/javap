package corejavapart1;

import java.util.Scanner;

public class LoopControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i==3)
			{
				//break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("using while loop");
		int j=0;
		while(j<=n)
		{
			if(j==3)
			{
				//break;
				j++;
				continue;
			}
			System.out.println(j);
			j++;
		
		}
		do
		{
			if(j==3)
			{
	
				continue;
			}
			j++;
		}while(j<=n);
		
	}

}
