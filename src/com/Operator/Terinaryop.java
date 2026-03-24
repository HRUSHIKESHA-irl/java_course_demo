package com.Operator;

public class Terinaryop {

	public static void main(String[] args) {
		
		int marks = 45;
		
		//Ternary operator is a concise way to evaluate a condition 
		
		//: condition ? expression1 : expression2
		
		String total = (marks >= 35) ? "Pass" : "Fail";
		System.out.print("Result: " + total);
		

	}

}
