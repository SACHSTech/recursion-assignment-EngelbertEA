package recursionAssignment;

/**
*Java file that contains the Recursion Assignment code
* @author: E. Aroozoo
*/

public class Recursion{
  /**
  *Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields *2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 *removes the rightmost digit (126 / 10 is 12).
  *
  * @param n - the int value that is being checked to see if there are 7s
  * @return how many number 7s there are in the int value
  * @author: E. Aroozoo
  */
  public static int count7(int n) {
    if(n < 7) {
      return 0;     
    //Checks if last digit of the value is 7
    } else if(n % 10 == 7) {
      //Returns 1 since there is a 7 and removes the last digit
      return 1 + count7(n / 10);
    //The digit does not contain a 7
    } else
    //Returns 0 since there is not a 7 and removes the last digit
    return 0 + count7(n / 10);
  }
  /**
  *Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been *replaced by "3.14".
  *
  * @param str - the string that is being checked to see if there is "pi"
  * @return the string that contains 3.14 instead of pi
  * @author: E. Aroozoo
  */
  public static String changePi(String str) {
    //Base Case
    if(str.length() < 2) {
      return str;

    //Recursive Case
    } else if(str.substring(0,2).equals("pi")) {
      //If there is Pi, return 3.14 and move down to the next 2 letters
      return "3.14" + changePi(str.substring(2));
    } else {
      //If there is no Pi, return the letter and move down to next letter
      return str.charAt(0) + changePi(str.substring(1));
    }
  }
  /**
  *Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been *reduced to a single char. So "yyzzza" yields "yza".
  *
  * @param str - the string that is being checked to see if there is are adjacent characters
  * @return the string that removes all the adjacent characters making it "cleaned"
  * @author: E. Aroozoo
  */
  public static String stringClean(String str) {
  //Variable
  int intLength;

  //Setting Variable
  intLength = str.length() - 1;

    //If the string has less than 1 character, return the string as there is nothing to remove
    if(str.length() <= 1) {
      return str;
    //If the current letter is the same as the letter before
    } else if(str.charAt(intLength) == str.charAt(intLength-1)) {
      //Return the string without the current letter
      return stringClean(str.substring(0, intLength));
    //If all conditions fail meaning that the previous letter does not equal to current letter
   } else {
      //Returns the current letter and previous letter
      return stringClean(str.substring(0, intLength)) + str.charAt(intLength);
   }
  }
}
