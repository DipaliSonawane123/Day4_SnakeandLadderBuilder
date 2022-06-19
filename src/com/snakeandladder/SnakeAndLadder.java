/* /* The Player rolls the die to get a number between 1 to 6.
 - Use ((RANDOM)) to get the number between 1 to 6 */

package com.snakeandladder;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder");
        int position=0;
        int randomCheck=(int) Math.floor(Math.random() * 10) % 6+1;
        System.out.println(randomCheck);

    }
    }

