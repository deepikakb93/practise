package practisetest;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle:");
		System.out.println("Enter the time:");
		System.out.println("Enter the rate:");
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		float si;
		si=(p*t*r)/100;
		
		System.out.println("Simple Interest value is: "+si);

	}

}
