package corejavapart1;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Object system;
// TODO Auto-generated method stu
		System.out.println("Enter which table you want");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<=10;i++)
        {
        	System.out.println(n+"*"+i+"="+n*i);
 
        }
	}

}
