/********************************************
 *Perpose:To Find the Number is Prime or Not
 *
 *@author:Sayeed khan
 *@version: 1.8
 *@since: 06-08-2017
 ********************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class primeNumber {

   public static void main(String args[]) {
      
      // TO DISPLAY A PRIME NUMBER MESSAGE
      String PRIME_NUMBER_MESSAGE = " is Prime number.";

      // TO DISPLAY A NOT PRIME NUMBER MESSAGE
      String NOT_PRIME_NUMBER_MESSAGE = " is not Prime Numbe.";

      // mNumber is take input from user
      int mNumber;

      // mFlag is use to counter
      int mFlag = 0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Number: ");
      mNumber=sc.nextInt();
      
      //O is Not a Prime Number
      if(mNumber == 0)
	System.out.print("0 is not prime");

      for(int i=1;i<=mNumber;i++) {
	  if((mNumber%i)==0)
             mFlag++;
      }
      
      //print out whether number is prime or Not
      if(mFlag == 2)
         System.out.println(mNumber+PRIME_NUMBER_MESSAGE);
      else
         System.out.println(mNumber+NOT_PRIME_NUMBER_MESSAGE);
   }
}
