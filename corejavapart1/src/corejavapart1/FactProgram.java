package corejavapart1;

import java.util.Scanner;

public class FactProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(" enter number for factorial");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int prod=1;
      /*  for(int i=1;i<=n;i++)
        {
        	prod=prod*i;
        }
        System.out.println(prod);*/
        int i=1;
        while(i<=n)
        {
        	prod=prod*i;
        	i++;
        }
        System.out.println(prod);

	}

}
