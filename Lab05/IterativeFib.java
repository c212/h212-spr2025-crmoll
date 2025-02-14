package Labs.Lab05.LabProbs05;
import java.util.*;
public class IterativeFib {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();

        int fold1 = 1;
        int fold2 = 1;
        int fnew = fold1 + fold2;
        int i = 0;
        while(i < (num - 3)) {
            fold2 = fold1;
            fold1 = fnew;
            fnew = fold1 + fold2;
            i++;
            System.out.println(fnew);
        }
    }
}
