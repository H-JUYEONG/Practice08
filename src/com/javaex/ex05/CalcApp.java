package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Add add = new Add();
		Div div = new Div();
		Mul mul = new Mul();
		Sub sub = new Sub();

		sc.close();
	}
}
