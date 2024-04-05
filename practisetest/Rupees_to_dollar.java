package practisetest;

import java.util.Scanner;

public class Rupees_to_dollar {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the rupees value to convert to dollars:");
		int a=sc.nextInt();
		
		double val;
		val=a*0.012;
		System.out.println("The Dollar value is: "+val);

	}

}
