
/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/lib/StringAnagram.java
 *  Execution:    java -cp bin com/bridgelabz/lib/StringAnagram
 *  Purpose:String Functions like Anagram and palindrome
 *
 *  @author  Sayeed Khan
 *  @version 1.8.0
 *  @since   25-08-2017
 *
 ********************************************************************************/
package com.bridgelabz.lib;
class StringAnagram{

    static String isAnagram_Msg = "String is Anagram";

    static String isNotAnagram_Msg = "String is not Anagram";

    static char[] stringArray(String str){
        int length = str.length();
        char[] mString = new char[length];
        for(int i =0; i < length; i++){
            mString[i] 


= str.charAt(i);
        }
        return mString;
    }

    static boolean isAnagram(String str1, String str2){

        boolean mAnagram = false;

        int lengthFirst = str1.length();
        int lengthSecond = str2.length();

        if(lengthFirst == lengthSecond) {

            for (int i = 0; i < lengthFirst; i++) {

                for (int j = 0; j < lengthFirst; j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {

                        mAnagram = true;
                        break;
                    }
                }
            }
        }
        return mAnagram;
    }

    static void isEqual(String str1, String str2){
        char lengthStringFirst[] = stringArray(str1);
        char lengthStringSecond[] = stringArray(str2);

        if(lengthStringFirst.length == lengthStringSecond.length)
            System.out.println("Two String array are equal");
        else
            System.out.println("Two String array are not equal");
    }

    public static void main(String args[]){

        String mString1 = args[0];
        String mString2 = args[1];

        boolean mAnagramMsg = isAnagram(mString1,mString2);

        if(mAnagramMsg == true)
            System.out.println(isAnagram_Msg);
        else
            System.out.println(isNotAnagram_Msg);
          
        char[] name = stringArray(mString1);
        for(int i = 0; i < name.length; i++)
             System.out.println(name[i]);
    }
}

