package Labs.Lab05.LabProbs05;

import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        for (int i = 2; i < number; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}