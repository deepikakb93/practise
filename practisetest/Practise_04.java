package practisetest;

import java.util.Scanner;

public class Practise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no1:");
		int a=sc.nextInt();
		System.out.println("Enter the no2:");
		int b=sc.nextInt();
		System.out.println("Enter the Operator:");
		String s=sc.next();
		int res;
		if(s.contains("+")) {
			res=a+b;
			System.out.println(res);
		}
		if(s.contains("-")) {
			res=a-b;
			System.out.println(res);
		}
		if(s.contains("*")) {
			res=a*b;
			System.out.println(res);
		}
		
	}

}
