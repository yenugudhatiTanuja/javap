package corejavapart1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to check even or odd");
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        /* if(n%2==0)
         {
 			System.out.println("Number is even---->"+n);

         }
         else
         {
 			System.out.println("Number is odd----->"+n);

         }*/
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
	         {
	 			System.out.println("Number is even---->"+i);

	         }
	        // else
	        // {
	 			//System.out.println("Number is odd----->"+i);
	        // }
		}
	}

}
