package Labs.Lab05.LabProbs05;

import java.util.Scanner;

public class FactoringIntegers { //P6.4
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        int  candidate = 2;
        while (number != 1) {
            if (number % candidate == 0) {
                System.out.println( candidate );
                number = number / candidate;
            } else {
                candidate += 1;
            }
        }
    }
}