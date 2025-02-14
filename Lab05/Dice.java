package Labs.Lab05.LabProbs05;

public class Dice {
    int sixes = 0;
    int times = 0;
    public void roll() {
        int face = (int)(Math.random() * 6) + 1;
        if (face == 6) this.sixes += 1;
        this.times += 1;
    }
    public void reset() {
        this.times = 0;
        this.sixes = 0;
    }
    public static void main(String[] args) {
        Dice a = new Dice();
        int gamesWon = 0, gamesTotal = 0;
        int target = 1000000; // the million times they talk about
        for (int i = 0; i <= target; i++) { // ten times
            a.roll();
            a.roll();
            a.roll();
            a.roll();
            // did I win?
            if (a.sixes > 0) {
                gamesWon += 1;
            }
            gamesTotal += 1;
            a.reset();
            if (i % 50000 == 0 && i > 0)
                System.out.println( "After " + i + " games, your winning percentage is: " + ((double)gamesWon / gamesTotal) );
        }
        System.out.println( "Out of " + target + " games, you won " + gamesWon + " for a percentage of: " + ((double)gamesWon / gamesTotal) );
    }
}