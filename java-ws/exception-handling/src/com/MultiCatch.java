package com;

import java.io.FileInputStream;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			//int x = 10 / 0;
			//int i[] = new int[1];
			//i[2] = 98;
			//FileInputStream fis=new FileInputStream("d:/hhhh.txt");

		} catch (ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
