package corejavapart1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of rows");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t = 1;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(+t+" ");
				t++;

			}
			System.out.println();
		}

	}

}
