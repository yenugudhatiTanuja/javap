package corejavapart1;

import java.util.Scanner;

public class BitwiseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int resXOR=number1^number2;
	    int resOR=number1|number2;
	    int resAND=number1&number2;
	    int resCom=(~number1);
       System.out.println(" ^ is----->"+resXOR);
       System.out.println(" | is----->"+resOR);
       System.out.println(" & is----->"+resAND);
       System.out.println(" ~ is ---->"+resCom);

	}

}
