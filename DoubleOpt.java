/***************************************************************************
* Perpose : Get input and Done Some operations  using Double Values
*
*@author : Sayeed Khan
*@version : 1.8.0
*@since : 09-08-2017
****************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class DoubleOpt {
	
	public static void main(String args[]) { 

		Scanner sc = new Scanner(System.in);
		
		//a,b,c is decleared To take input from user
		double mA, mB, mC;
		
		//Taking Input From User
		System.out.print("Enter values A:");
		mA=sc.nextDouble();
		System.out.print("Enter values B:");
		mB=sc.nextDouble();
		System.out.print("Enter values C:");
		mc=sc.nextDouble();
		

		//Prints The output  
		System.out.println("a + b * c = "+( mA + mB * mC ));
		System.out.println("a * b + c = "+( mA * mB + mC ));
		System.out.println("c + a / b = "+( mC + mA / mB ));
		System.out.println("a % b + c = "+( mA % mB + mC ));
	}
}
