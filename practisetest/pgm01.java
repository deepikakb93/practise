package practisetest;

import java.util.Scanner;

public class pgm01 {
	//0,1,1,2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int temp;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count=2;
		while(count<=n) {
			temp=b;
			b=a+b;
			a=temp;
			count++;
		}
		System.out.println(b);
	}

}
