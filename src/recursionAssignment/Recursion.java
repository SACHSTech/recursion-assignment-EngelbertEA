package recursionAssignment;

public class Recursion{
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
}
