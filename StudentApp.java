package com.librarymanagement.first;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		System.out.println("press 1 for issue book\n press 2 for submit book");
		StudentOp o=new StudentOp();
		boolean start=true;
		while (start) {
		System.out.println("enter number");
		Scanner  sc = new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			o.issueBook();
	    	break;
		case 2:
			o.SubmitBook();
			break;	
		case 3:
			start=false;
			break;
		}	
		}
	}
}
