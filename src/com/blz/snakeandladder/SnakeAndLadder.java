package com.blz.snakeandladder;

public class SnakeAndLadder {
      //  public static final int START_POSITIION=0;
    public static final int IS_SNAKE=1;
    public static final int IS_LADDER=2;

    public static void main(String[] args) {
            System.out.println("Welcome to Snake and Ladder Game");
            int currentPosition=0;

        System.out.println("Player is at "+currentPosition+" position");
        int diceNum=(int)(Math.random() * 10) % 6 + 1;
        System.out.println("die value is "+diceNum);
        int option=(int)(Math.random() * 10) % 3;

        if(option==IS_SNAKE){
            System.out.println("Snake option");
            currentPosition = currentPosition - diceNum;
        }
        else if(option==IS_LADDER){
            System.out.println("Ladder option");
            currentPosition = currentPosition + diceNum;
        }
        else{
            System.out.println("No Play option");
        }
        System.out.println("Player is at "+currentPosition+" position");
    }
}
