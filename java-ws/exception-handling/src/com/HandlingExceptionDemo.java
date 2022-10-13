package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HandlingExceptionDemo {

	public static void main(String[] args) {

		//Scanner sc = new Scanner("d:/abc.txt");
		//sc.nextLine();

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		boolean flag = true;
		while (flag) {
			try {
				System.out.println("Enter a Number: ");
				int x = Integer.parseInt(br.readLine());
				System.out.println("Number is: " + x);
				flag = false;
			} catch (Exception e) {
				System.out.println("Invalid Input Try again: ");
			} // end of catch
		} // end of while

	}// end of main

}
