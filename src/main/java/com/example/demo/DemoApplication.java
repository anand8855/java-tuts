package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("============================================");

		// arr();
		// patternstar(5);
		bubbleRotate(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 3);

	}

	public static void bubbleRotate(int[] arr, int p) {
		for (int i = 0; i < p; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void rotateArr(int[] arr, int p) {
		if (p > arr.length) {
			p = p % arr.length;
		}

		int[] res = new int[arr.length];

		for (int i = 0; i < p; i++) {
			res[i] = arr[arr.length - p + i];
		}

		for (int i = p, j = 0; i < arr.length; i++, j++) {
			res[i] = arr[j];
		}

		System.arraycopy(res, 0, arr, 0, arr.length);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void patternstar(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = a; j <= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void arr() {
		int[][] arr2d = {
				{ 1, 2, 3 },
				{ 6, 0, 8 },
				{ 11, 12, 13 }
		};

		int row = 0;
		int col = 0;

		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				if (arr2d[i][j] == 0) {
					row = i;
					col = j;
				}
			}
		}

		int[][] arr2 = new int[3][3];

		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				if (row == i) {
					arr2[i][j] = 0;
				} else if (col == j) {
					arr2[i][j] = 0;
				} else {
					arr2[i][j] = arr2d[i][j];
				}
			}

		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(" " + arr2[i][j]);
			}
			System.out.println();
		}

		System.out.println("Length of arr2d: " + arr2d.length);
		System.out.println("Number of columns in arr2d: " + arr2d[0].length);

	}

	public static void factorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact *= i;
		}

		System.out.printf("Factorial of %d id %d.", a, fact);
	}

	public static void contertToBinary(int a) {
		System.out.println(Integer.toBinaryString(a));
	}

	public static void addition(int a, int b) {
		int sum = a + b;

		System.out.printf("Sum of %d, %d is %d.", a, b, sum);
	}

	public static void swapNumber(int a, int b) {
		System.out.printf("Before swaping numbers a: %d, b: %d ", a, b);

		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.printf("After swaping numbers a: %d, b: %d ", a, b);

	}

}
