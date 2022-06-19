/* The Player then checks for a Option. They are No Play, Ladder or Snake.
 - Use ((RANDOM)) to check for Options - In Case of No Play the player stays in the sameposition
- In Case of Ladder the player moves ahead by the number of position received in the die
- In Case of Snake the player moves behind */

package com.snakeandladder;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder");
        int position=0;
        int randomCheck=(int) Math.floor(Math.random() * 10) % 6+1;
        int randomCheck2 = (int) (Math.random() * 10) % 3;
        switch(randomCheck2) {
            case 0:
                System.out.println("No play");
                position += 0;
                break;
            case 1:
                System.out.println("Ladder");
                position += randomCheck;
                break;
            case 2:
                System.out.println("Snake");
                position -= randomCheck;
                break;

    }
    }
}

