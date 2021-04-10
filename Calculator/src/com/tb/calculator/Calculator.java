package com.tb.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean keepGoing = true;
		String response;
		do {
			System.out.println("Pick first integer.");
			int x = sc.nextInt();
			System.out.println("Pick second integer.");
			int y = sc.nextInt();
			System.out.println("Pick operation.");
			int operation = sc.nextInt();
			
			switch(operation) {
			case 1:
				addNumbers(x,y);
				break;
			case 2:
				subtractNumbers(x,y);
				break;
			case 3:
				multiplyNumbers(x,y);
				break;
			case 4:
				divideNumbers(x,y);
				break;
			}
			sc.nextLine();
			System.out.println("Keep going? (y/n)");
			response = sc.nextLine();
			if(response.equals("n")) {
				keepGoing = false;
			}
		} while (keepGoing);
		System.out.println("Good Bye!");
	}
	public static void addNumbers(int x, int y) {
		System.out.println(x + y); ;
	}
	public static void subtractNumbers(int x, int y) {
		System.out.println(x - y);
	}
	public static void multiplyNumbers(int x, int y) {
		System.out.println(x *y);
	}
	public static void divideNumbers(int x, int y) {
		System.out.println((double) x / y);
	}

}
