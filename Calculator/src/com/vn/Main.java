package com.vn;

import com.vn.controler.Calculator;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello");
		Calculator calculator = new Calculator();
		calculator.setA(5);
		calculator.setB(4);
		calculator.setC("/");
		float result = calculator.calculator();
		System.out.println(result);
	}
}
