package practisetest;

import java.util.Scanner;

public class Large_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no1:");
		int a=sc.nextInt();
		System.out.println("Enter the no2:");
		int b=sc.nextInt();
		if(a!=b) {
		if(a>b) {
			System.out.println("The largest number is: "+a);
		}else {
			System.out.println("The largest number is: "+b);
		}
		}else
		System.out.println("Both numbers are equal");

		
	}

}
