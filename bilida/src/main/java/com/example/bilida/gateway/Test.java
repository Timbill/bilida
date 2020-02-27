package com.example.bilida.gateway;

public class Test {
	interface Sayable {
		void print();
	}
	
	public static void main(String[] args) {
 
		// with lambda expression
        Sayable withLambda = () -> System.out.println(Runtime.getRuntime().totalMemory());
        withLambda.print();
	}

}