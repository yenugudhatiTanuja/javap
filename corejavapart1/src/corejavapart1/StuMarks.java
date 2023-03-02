package corejavapart1;

import java.util.Scanner;

public class StuMarks {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("---Enter Marks of three subjects ---");
	    int sub1 =scan.nextInt();
	    int sub2 =scan.nextInt();
	    int sub3 =scan.nextInt();
	    int per=(sub1+sub2+sub3)/3;
	    System.out.println(" Average is ---->"+per+"%");
	    /*if(per>90)
	    {
	    	System.out.println("OutStanding--->GRADE -O");
	    }
	    else if((per<=90)&&(per>80))
	    {
	    	System.out.println("Excellent--->GRADE -E");

	    }
	    else if((per<=80)&&(per>70))
	    {
	    	System.out.println("First class--->GRADE -A");
        }
	    else if((per<=70)&&(per>60))
	    {
	    	System.out.println("second class--->GRADE -B");
        }
	    else if((per<=60)&&(per>55))
	    {
	    	System.out.println("Third class-->GRADE -c");

	    }
	    else if((per<=55)&&(per>50))
	    {
	    	System.out.println("PASS--->GRADE -P");
        }
	    else
	    {
	    	System.out.println("Fail--->GRADE -F");

	    }*/
	    switch(per/10)
	    {
	       case 10:
	       case 9:
	    	    System.out.println("GRADE - O");
	    	    break;
	       case 8:
	    	    System.out.println("GRADE -A");
	    	    break;
	       case 7:
	    	    System.out.println("GRADE -B");
	    	    break;
	       case 6:
	    	    System.out.println("GRADE -C");
	    	    break;
	       case 5:
	    	    System.out.println("GRADE -D");
	    	    break;
	       default:
	    	   System.out.println("fail-F");
	    	    break;
	    }
	}
	

}
