package corejavapart1;

import java.util.Scanner;

public class MetEqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String s1="*HELLO";
             String s2="HELLO";
            // String s4="HELLO";
             String s3="HELLO";
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter string 2 two string to compare");
        //String s1=s.nextLine();
        //String s2=s.nextLine();
        // boolean s3=s1.equals(s2);
            // boolean s6=s3.equals(s4);
            // System.out.println("equals of 1 and 2"+s3);
             //System.out.println("equals od 3 and 4"+s6);
             //boolean s7=(s1==s2);
             //System.out.println(" '==' of 1 and 2--->"+s7);
             //boolean s8=(s3==s4);
             //System.out.println(" '==' of 3 and 4--->"+s8);
        System.out.println("startsWith ---->"+s1.startsWith("he"));
        System.out.println("endsWith---->"+s1.endsWith("lo"));
        System.out.println("equalsignorecase--->"+s1.equalsIgnoreCase(s2));
        System.out.println("indexof---->"+s1.indexOf('E'));
        System.out.println("lastindexof--->"+s1.lastIndexOf('L'));
        System.out.println("trim---->"+s1.trim());
        System.out.println("replace character--->"+s1.replace('L', 'p'));
        System.out.println("replace string---->"+s3.replace("HELLO", "tanuja"));
        System.out.println("contains  ---->"+s1.contains("EL"));
        System.out.println("comapareTo---->"+s2.compareTo(s3));
        System.out.println("charAt---->"+s1.charAt(3));



        


	}

}
