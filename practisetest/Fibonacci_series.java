package practisetest;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,series,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which fib series is to be displayed:");
		series=sc.nextInt();
		System.out.print("The Fibonacci series is: "+n1+" "+n2);
		for(int i=2;i<=series;i++) {
			
			temp=n1+n2;
			n1=n2;
			n2=temp;
			System.out.print(" "+temp);
		}
		

	}

}
