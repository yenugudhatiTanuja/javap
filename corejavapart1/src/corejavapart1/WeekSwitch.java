package corejavapart1;

import java.util.Scanner;

public class WeekSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.println("---Week has 7 days enter number '1 to 7'that particular day will come");
	    int Num =scan.nextInt();
	    String day;
	    switch(Num)
	    {
	    case 1:
	        day="sunday";
	    	//System.out.println(day);
	    	break;
	    case 2:
	    	day="Monday";
	    	//System.out.println(day);
	    	break;
	    case 3:
	    	day="Tuesday";
	    	//System.out.println(day);
	    	break;
	    case 4:
	    	day="Wednesday";
	    	//System.out.println(day);
	    	break;
	    case 5:
	    	day="Thursday";
	    	//System.out.println(day);
	    	break;
	    case 6:
	    	day="friday";
	    	//System.out.println(day);
	    	break;
	    case 7:
	    	day="saturday";
	    	//System.out.println(day);
	    	break;
	    default:
	    	System.out.println("invalid Argument");
	    }
	    
	}

}
