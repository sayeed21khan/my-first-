/***************************************************************************
*Purpose : Takes two command­line arguments x and y and  calculate distance from point (x, y) to origin (0, 0)
*
*@author : Sayeed Khan
*@version : 1.8.0
*@since : 09-08-2017
****************************************************************************/
import java.util.*;

class Distance {
	public static void main(String args[]) {

		//Takes commandline arguments
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);

		double a = Math.pow(x,2);
		double b = Math.pow(y,2);

		double dist = Math.sqrt(a+b);
                //formulae for calculating distance
		System.out.println("Distance from ("+ x +","+ y +") to(0,0) = "+ dist);
	} 
}
