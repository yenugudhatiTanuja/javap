package corejavapart1;

import java.util.Scanner;

public class LeftRightShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number1 for left shift");
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		System.out.println("Enter number2 for right shift");
		int result=number1<<1;
		int number2=sc.nextInt();
		int res=number2>>1;
		System.out.println("left shift is"+result);
		System.out.println("Right shift is"+res);

	}

}
