/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:Janine Yanes, jqy2@scarletmail.rutgers.edu, jqy2
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        long number = Long.parseLong(args[0]);
        Long secondRun = number / 10;
        int a = 0;
        int b = 0;
        for (int i = 0; i <= 7; i++) {
            a = a + (int)(number % 10);
            number = number / 100;
            b = b + (int)(secondRun % 10);
            secondRun = secondRun/100;
            }
        a = a % 10;
        b = (3 * b) % 10;
        System.out.println((a + b) % 10);
        }
    }