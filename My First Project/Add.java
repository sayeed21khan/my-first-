/******************************************************************************
 *  Compilation:  javac -d bin Add.java
 *  Execution:    java -cp bin com.bridgelabz.util.Add n
 *  
 *  Purpose: Addition of 2 Nos.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;
import java.util.Scanner;
class Add
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter two nos:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("sum of the element is:"+c);
}
}

