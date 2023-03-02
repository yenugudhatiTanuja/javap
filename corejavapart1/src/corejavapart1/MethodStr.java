package corejavapart1;

import java.util.Scanner;

public class MethodStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println("length is---->"+str.length());
        System.out.println("capital is---->"+str.toUpperCase());
        System.out.println("small is---->"+str.toLowerCase());

	}
}

