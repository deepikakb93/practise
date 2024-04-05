package practisetest;

import java.util.Scanner;

public class odd_even_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to check odd/even:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		if(no>0) {
			if(no%2==0) {
				System.out.println("No is Even");
			}else {
				System.out.println("No is odd");
			}
		}else {
			System.out.println("Entered input is less than 0");
		}
		
	}

}
