/* Code-3:
Question 3: Pattern Printer
Your task is to print the following patter for a given n value.
For n=2,
pattern is:
2 2 1 1
2 1
*/
import java.util.Scanner;
class PatternPrinter {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int n = in .nextInt();
 patternPrinter(n);
 }
 static void patternPrinter(int n){
     int h = n;
     for(int i=0;n>i;i++){
        for(int j=n; j>=1; j--){
            for(int k=h; k>=1;k--){
                System.out.print(j);}
        }
        h=h-1;
        System.out.println();}
 }}