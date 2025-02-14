package Labs.Lab05.LabProbs05;
import java.util.*;
import java.util.Arrays;
public class MontyHallParadox{

    public static void main(String[] args){
    // play games
        int strat1 = 0;
        int strat2 = 0;
        for(int i = 0; i < 1000; i++){
            int[] result = playGame();
            if(result[0] == 1){
                strat1 += 1;
            }
            if(result[1] == 1){
                strat2 += 1;
            }
        }
        System.out.println("Player switches: " + strat1);
        System.out.println("Player sticks: " + strat2);




    }
    public static int[] playGame(){

        int[] result = new int[2]; // result of the game which will be returned

        Random r = new Random(); //creates a random object

        int doorWCar = r.nextInt(3) + 1; // chooses the door with a car in it
//        System.out.println("Door with car: " + doorWCar);

        int[] arr = new int[3]; // array of doors
        arr[doorWCar-1] = 1; // puts the car behind a random door

//        System.out.println("Doors: " + Arrays.toString(arr)); //prints the doors

        int doorPlayer = r.nextInt(3) + 1;
//        System.out.println("Player selects door " + doorPlayer); //player selects a door

        int doorHost;
        do{
            doorHost = r.nextInt(3) + 1;
        }while((doorHost == doorPlayer) || (arr[doorHost-1] == 1));
//        System.out.println("Host opens door " + doorHost); //host opens a door with a goat

        int choice = r.nextInt(2) + 1;
//        System.out.println("Strategy: " + choice);
        //Strategy 1 - if strat 1 - player switches
        if (choice == 1)
        {
            //painfully inefficient logic to switch the players door (I can't think of a better way)
            boolean lean = true;
            if (doorPlayer == 1 && lean){
                if (doorHost == 2){
                    doorPlayer = 3;
                    lean = false;
                }
                else if (doorHost == 3){
                    doorPlayer = 2;
                    lean = false;
                }
            }
            else if (doorPlayer == 2 && lean){
                if (doorHost == 1){
                    doorPlayer = 3;
                    lean = false;
                }
                else if(doorHost == 3){
                    doorPlayer = 1;
                    lean = false;
                }
            }
            else if (doorPlayer == 3 && lean){
                if (doorHost == 1){
                    doorPlayer = 2;
                    lean = false;
                }
                else if (doorHost == 2){
                    doorPlayer = 1;
                    lean = false;
                }
            }

            if(doorPlayer == doorWCar){
                result[0] = 1;
//                System.out.println("Player wins!");
            }
            else{
//                System.out.println("Player loses, :(");
            }

        }
        //Strategy 2 - if strat 2 - player sticks
        else if (choice == 2)
        {
            if(doorPlayer == doorWCar){
//                System.out.println("Player wins!");
                result[1] = 1;
            }
            else{
//                System.out.println("Player loses, :(");
            }
        }
        return result;
    }

}