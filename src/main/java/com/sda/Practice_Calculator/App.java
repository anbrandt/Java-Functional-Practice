package com.sda.Practice_Calculator;

import java.util.Scanner;

/**
 * Created by andrzej on 03.07.17.
 */
public class App {


	public static void main(String[] args) {

		MathCalc calculator = new MathCalc();



		Scanner scanner = new Scanner(System.in);
		System.out.println("Write down operator");
		String operator = scanner.nextLine();
		System.out.println("write down two integers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();


		calculator.getTheResult(operator,a,b);


	}


}
