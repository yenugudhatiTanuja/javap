package corejavapart1;

import java.util.Scanner;

public class FiboProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" enter number for fibonacci");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f0=0,f1=1,f=1;
        System.out.print(f0+"  "+f1);
        for(int i=2;i<=n;i++)
        {
        	f=f0+f1;
        	System.out.print(" "+f);
        	f0=f1;
        	f1=f;
        }
        //System.out.println(f1);*/
        /*while(f<=n)
        {
        	f=f0+f1;
            System.out.println(f);
            f0=f1;
            f1=f;

        }*/
        
	}

}
