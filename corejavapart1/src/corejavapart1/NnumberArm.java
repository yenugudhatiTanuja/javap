package corejavapart1;

import java.util.Scanner;

public class NnumberArm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter number to check amstrong");
		Scanner s=new Scanner(System.in);
		//int arr[]=new arr[10];
		int num,sum,r;
		System.out.println("enter size of the elements");
		int m=s.nextInt();
		int arr[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
		  //System.out.println("Enter number to check amstrong");
		//  int n=s.nextInt();
		  
		   num=arr[i];
		   sum=0;
		  while(arr[i]!=0)
		  {
			  r=arr[i]%10;
			 //System.out.println("r---->"+r);
			 sum=sum+r*r*r;
			 //System.out.println("sum is---->"+sum);
			 arr[i]=arr[i]/10;
			 //System.out.println("n---->"+arr[i]);
		 }
		  if(num==sum)
			{
				System.out.println("given number is amstrong");
			}
		  else
		  {
				System.out.println("given number is not armstrong");

		  }
		
		}
		//if(arr==sum)
		//{
			//System.out.println("given number is amstrong");
		//}
	}

}
