package corejavapart1;

import java.util.Scanner;

public class MenuProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	while(true)
	{
		Scanner scan=new Scanner(System.in);
	    //System.out.println("---Enter two integer values");
	   int a,b;
	    System.out.println("Enter your choice");
	    System.out.println("1.Addition\n2.subtraction\n3.multiplication\n4.division\n5.modulodivision\n6.power\n7.square root\n8.exit");
	    int ch=scan.nextInt();
	    int s=0;
	   // boolean n=scan.nextBoolean();
	    switch(ch)
	    {
	    case 1:
	    	System.out.println("---Enter two integer values");
		     a =scan.nextInt();
		     b =scan.nextInt();
	    	 s=a+b;
		    System.out.println("Addition------>"+s);
		    break;
	    case 2:
	    	System.out.println("---Enter two integer values");
		     a =scan.nextInt();
		     b =scan.nextInt();
	        s=a-b;
		    System.out.println("subtraction----->"+s);
		    break;
	    case 3:
	    	System.out.println("---Enter two integer values");
		    a =scan.nextInt();
		    b =scan.nextInt();
	    	 s=a*b;
		    System.out.println("multiplication----->"+s);
		    break;
	    case 4:
	    	System.out.println("---Enter two integer values");
		    a=scan.nextInt();
		     b =scan.nextInt();
		    if((a==0)||(b==0))
		    {
		    	System.out.println("zero is not applicable please enter another number");
		    	//System.out.println("enter your two number");
		    	//int r=scan.nextInt();
		    	//int m=scan.nextInt();
		    }
		    else {
		    	a=scan.nextInt();
			     b =scan.nextInt();
		         s=a/b;
		    System.out.println("division----->"+s);
		    }
		    break;
	    case 5:
	    	System.out.println("---Enter two integer values");
		     a =scan.nextInt();
		    b =scan.nextInt();
	    	 s=a%b;
		    System.out.println("modulo division----->"+s);
		    break;
	    case 6:
	    	System.out.println("---Enter power integer values");
		     a =scan.nextInt();
		     b =scan.nextInt();
		  System.out.println(Math.pow(a,b));
		  break;
	    case 7:
	    	System.out.println("---Enter square integer values");
		     a =scan.nextInt();
			 System.out.println(Math.sqrt(a));
            break;
	    case 8:
	    	System.exit(0);
	    default:
		    System.out.println("-----INVALID ARGUMENT");    	
	    }
	  
	}

   
	}

}
