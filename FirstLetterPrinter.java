/*
Question 1 : First Letter Printer
You are provided with a string.
Your task is to create a string with the first letter of every word in the string.
Sample Test Case
Input:
great learning
Output:
gl*/

import java.util.Scanner;
class FirstLetterPrinter {
public static void main (String[] args) {
 Scanner in = new Scanner(System.in);
 String input = in.nextLine();
System.out.println(firstLetterPrinter(input));
}
static String firstLetterPrinter(String str) {
 // write your code here
  String flp="";
  flp = flp + str.charAt(0);
  for (int i=1; i<str.length(); i++){
      if (str.charAt(i) == ' '){
          int f = i+1;
        flp = flp +str.charAt(f);}
  }
    return flp;
 }}
