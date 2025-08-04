package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
   
    System.out.println("============================================");

    factorial(5);
  }

  public static void factorial(int a){
		int fact = 1;
		for(int i = 1; i <= a; i++ ){
			fact *= i;
		}

		System.out.printf("Factorial of %d id %d.", a , fact);
	}

	public static void contertToBinary(int a){
		System.out.println(Integer.toBinaryString(a));
	}

	public static void addition(int a, int b){
		int sum = a + b;

		System.out.printf("Sum of %d, %d is %d.", a, b, sum);
	}

	public static void swapNumber(int a, int b){
		System.out.printf("Before swaping numbers a: %d, b: %d ", a, b);

		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.printf("After swaping numbers a: %d, b: %d ", a, b);

	}

}
