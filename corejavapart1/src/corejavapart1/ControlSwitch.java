package corejavapart1;

import java.util.Scanner;

public class ControlSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("---Enter two integer values");
	    int s1 =scan.nextInt();
	    int s2 =scan.nextInt();
	   System.out.println("Enter which expression you want +-*/%");
	    char ch=scan.next().charAt(0);
	    int s=0;
	    switch(ch)
	    {
	    case '+':
	    	 s=s1+s2;
		    System.out.println("Addition------>"+s);
		    break;
	    case '-':
	        s=s1-s2;
		    System.out.println("subtraction----->"+s);
		    break;
	    case '*':
	    	 s=s1*s2;
		    System.out.println("multiplication----->"+s);
		    break;
	    case '/':
	    	s=s1/s2;
		    System.out.println("division----->"+s);
		    break;
	    case '%':
	    	 s=s1%s2;
		    System.out.println("modulo division----->"+s);
		    break;
       default:
		    System.out.println("-----INVALID ARGUMENT");    	
	    }
	    
	}
	
}

