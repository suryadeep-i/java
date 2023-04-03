package basicprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt(),a=0,b=1;
		for(int i=0;i<num;i++) {
			a=a+b;
			b=a-b;
			System.out.println(b);
		}

	}

}
