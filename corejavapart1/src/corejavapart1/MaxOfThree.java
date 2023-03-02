package corejavapart1;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three values to find max value");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if((n1>n2)&&(n1>n3))
		{
			System.out.println("Maximum number is ---->"+n1);
		}
		else if((n2>n1)&&(n2>n3))
		{
			System.out.println("Maximum number is ---->"+n2);

		}
		else
		{
			System.out.println("Maximum number is ---->"+n3);

		}

	}

}
