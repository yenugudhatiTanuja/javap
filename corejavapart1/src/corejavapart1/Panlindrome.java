package corejavapart1;

public class Panlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // String s="mom";
          StringBuilder s= new  StringBuilder("mom");
          s.reverse();
          String s1=s.toString();
          System.out.println(s1);
          if(s.equals(s1))
          {
        	  System.out.println(" String is palindrome----->");
          }
          else
          {
        	  System.out.println("String is not palindrome--->");
          }
          
	}

}
