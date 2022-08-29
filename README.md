# Prework-Assignment---Mukkala-Vijaya-Rama-Krishna-Dhanush
Month-1 Prework Assignment
One can find Problem statement along with code in the following link.
if any suggestions, you can reach out me via mail: mukkaladhanush747@gmail.com

All solutions Geeks for Geeks Compilier: https://ide.geeksforgeeks.org/93cd3962-11a2-4461-82ba-86d5a75db5fc

Prework Assignment
Question 1 : First Letter Printer
You are provided with a string.
Your task is to create a string with the first letter of every word in the string.
Sample Test Case
Input:
great learning
Output:
gl
Test case 1
Input:
When nothing goes right, go left.
Output:
Wngrgl
Test case 2
Input:
change the world by being yourself.
Output:
ctwbby
Test case 3
Input:
dream without fear. Love without Limits.
Output:
dwfLwL
Stub code
import java.util.Scanner;
class FirstLetterPrinter {
public static void main (String[] args) {
 Scanner in = new Scanner(System.in);
 String input = in.nextLine();
System.out.println(firstLetterPrinter(input));
}
static String firstLetterPrinter(String str) {
 // write your code here

 }
}
Prework Assignment
Question 2: Find Missing Number
You are provided with an array of the size n-1. It contains distinct integers in the range of 1 to n.
Your task is to find the missing number.
Input format:
Line 1 will take the value of n.
Line 2 will take the array's contents where numbers will be in the 1-n range.
Sample Test case:
5
1 2 3 4
Output:
4
Test case 1
Input:
10
1
2
3
4
5
6
7
8
9
Output:
10
Test case 2
Input:
7
1
3
4
5
6
7
Output:
2
Test case 3
Prework Assignment
Input:
6
1
2
3
5
6
Output:
4
Stub code
import java.util.Scanner;
class MissingNumberFinder {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int size = in .nextInt();
 int[] arr = new int[size-1];
 for(int i=0;i<size-1;i++)
 arr[i] = in.nextInt();
 System.out.println(missingNumberFinder(arr, size));
 }
 static int missingNumberFinder(int array[], int n) {
 // write your code here
 }
}
Prework Assignment
Question 3: Pattern Printer
Your task is to print the following patter for a given n value.
For n=2,
pattern is:
2 2 1 1
2 1
For n=3
pattern is:
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
Sample Test Case
Input:
2
Output:
2 2 1 1
2 1
Test case 1
Input:
5
Output:
5 5 5 5 5 4 4 4 4 4 3 3 3 3 3 2 2 2 2 2 1 1 1 1 1
5 5 5 5 4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1
5 5 5 4 4 4 3 3 3 2 2 2 1 1 1
5 5 4 4 3 3 2 2 1 1
5 4 3 2 1
Test case 2
Input:
0
Output:
Test case 3
Input:
7
Output:
Prework Assignment
7 7 7 7 7 7 7 6 6 6 6 6 6 6 5 5 5 5 5 5 5 4 4 4 4 4 4 4 3 3 3 3 3 3 3 2 2 2 2 2 2 2 1 1 1 1 1 1 1
7 7 7 7 7 7 6 6 6 6 6 6 5 5 5 5 5 5 4 4 4 4 4 4 3 3 3 3 3 3 2 2 2 2 2 2 1 1 1 1 1 1
7 7 7 7 7 6 6 6 6 6 5 5 5 5 5 4 4 4 4 4 3 3 3 3 3 2 2 2 2 2 1 1 1 1 1
7 7 7 7 6 6 6 6 5 5 5 5 4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1
7 7 7 6 6 6 5 5 5 4 4 4 3 3 3 2 2 2 1 1 1
7 7 6 6 5 5 4 4 3 3 2 2 1 1
7 6 5 4 3 2 1
Stub code
import java.util.Scanner;
class PatternPrinter {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int n = in .nextInt();
 patternPrinter(n);
 }
 static void patternPrinter(int n) {
 // write your code here
 }
}
