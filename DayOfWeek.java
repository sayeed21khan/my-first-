/***************************************************************************
* Purpose : Day of the week that date falls on.
*
*@author : Sayeed Khan
*@version : 1.8.0
*@since : 09-08-2017
****************************************************************************/
import java.util.*;

class DayOfWeek {

   public static void main(String args[]) {

         //Takes input from user as command Line argument
         int mMonth = Integer.parseInt(args[0]);
         int mDay = Integer.parseInt(args[1]);
         int mYear = Integer.parseInt(args[2]);

         //Formula to Calculate the date falls on  
         int y = mYear - (14 - mMonth) / 12;
         int x = y + y / 4 - y / 100 + y / 400;
         int m = mMonth + 12 * x * ((14 - mMonth) / 12) - 2;
         int d = (mDay + x + 31 * m / 12) % 7;

	 System.out.println(y +" "+m+" "+d);
   } 
}
            

