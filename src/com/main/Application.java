package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {			
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("height ?");
			int height = scan.nextInt();
				System.out.println("base ?");
			int base = scan.nextInt();
			if (height>0 && base>0) {			
				int parallelogramArea = height*base;
				System.out.println("parallelogramArea: "+parallelogramArea);
			}else {System.out.println("java.lang.Exception: Breadth and height must be positive");}
			
			}
	}	
}		


