package demopackage;

import java.util.Scanner;

public class DemoClass {
	
	static int b ;

	public static void main(String[] args) {


		int c=0;

		System.out.print("Enter a Number ");

		Scanner a= new Scanner(System.in);

		int nextInt = a.nextInt();



		String string = Integer.toString(nextInt);



	for(char b:string.toCharArray()) {
		 c =+ b - '0';

	}
	System.out.println(c);

	a.close();

	}

}
