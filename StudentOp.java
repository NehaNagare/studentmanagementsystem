package com.librarymanagement.first;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class StudentOp {
	Students st =new Students();
	Scanner sc = new Scanner (System.in);

public void issueBook() {
		System.out.println("enter id");
		st.setId(sc.nextInt());
		
		System.out.println("enter name");
		st.setName(sc.next());
		
		System.out.println("enter city");
		st.setCity(sc.next());
		
		st.setIssueDate(LocalDate.now());
		
		System.out.println("Book issued......");
		
//		st.setNoBookIssued(st.getNoBookIssued()+1);
//	
//	    Operations.setRemainingStock(1); 
		
		 st.setNoBookIssued(st.getNoBookIssued() + 1);

	        // Decrease remaining stock
	        Operations.setRemainingStock(0);
		
	}
    
  
public void SubmitBook() {
	System.out.println("Enter Student Id:");
	if(sc.nextInt() ==st.getId()) {
		st.setSubmitBook(LocalDate.now());
		long days = ChronoUnit.DAYS.between(st.getIssueDate() ,LocalDate.now());
		
		if(days<7) {
			System.out.println("0 file for this book");
		}
		else {
			int finedays=(int) (days-7);
			int fine=finedays*2;
			st.setTotalFine(st.getTotalFine()+fine);
			
		}
		
	}else {
		System.out.println("invalid BookID");
	}
	
	
}
	


public static void main(String[] args) {
	StudentOp sp=new StudentOp();
	sp.issueBook();
	sp.SubmitBook();
	
	
	
	
	
}

}
