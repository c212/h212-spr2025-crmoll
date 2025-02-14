package Labs.Lab05.LabProbs05;

import java.util.Random;

public class DrunkardsWalk{
    public static void main(String[] args){

        int x = 0, y = 0;
        Random r = new Random();
        for (int i = 0; i < 100; i++){
            int dir = r.nextInt(4);
            if (dir == 0){ //left
                x -= 1;
            }
            else if (dir == 1){ //right
                x += 1;
            }
            else if (dir == 2){ //up
                y -= 1;
            }
            else{ //down
                y += 1;
            }
        }
        System.out.println("Started at (0,0), ended at (" + x + ", " + y + ").");



    }

}