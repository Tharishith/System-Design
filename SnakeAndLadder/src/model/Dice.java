package model;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount =0;
    int min = 1;
    int max = 6;

    Random random;

    public Dice(int diceCount){
        this.diceCount = diceCount;

    }

    public int rollDice(){
        int totalSum =0;
        int diceUsed =0;

        while(diceUsed < diceCount) {
            int randomCount = ThreadLocalRandom.current().nextInt(min, max + 1);
            totalSum+=randomCount;
            diceUsed++;
        }
        return totalSum;
    }
}
