package Arrays;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int year=sc.nextInt();
      boolean isLeapYear=false;
      if(year%4==0) { 
    	  if(year%100==0) {
    		  if(year%400==0) {
    			  isLeapYear=true;
    		  }else {
    			  isLeapYear=false;
    		  }
    	  }else {
    		  isLeapYear=true;
    	  }
    	 
      }else {
    	  isLeapYear=false;
      }
     if(isLeapYear) {
    	 System.out.println("given year "+year+" is a leap year");
     }else {
    	 System.out.println("given year "+year+" is not a leap year");
     }
	}

}
