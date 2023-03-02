package corejavapart1;

import java.util.Scanner;

public class StuDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter Name");
       String name = scan.nextLine();
       System.out.println("Enter age");
       int age = scan.nextInt();
       scan.nextLine();
       System.out.println("Enter city");
       String city = scan.nextLine();
       System.out.println("Enter percentage");
       Double per = scan.nextDouble();
       System.out.println("Name  ----->"+name);
       System.out.println("age  ----->"+age);
       System.out.println("city  ----->"+city);
       System.out.println("percentage  ----> "+per);
       
	}

}
