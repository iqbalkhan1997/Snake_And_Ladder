package com.blz.snakeandladder;

public class SnakeAndLadder {
    public static final int START_POSITIION=0;
    public static final int IS_SNAKE=1;
    public static final int IS_LADDER=2;
    public static final int WINNING_POSITION=100;

    public static void main(String[] args) {
            System.out.println("Welcome to Snake and Ladder Game");
            int currentPosition=0;

        while(currentPosition<WINNING_POSITION) {

            int diceNum = (int) (Math.random() * 10) % 6 + 1;
            int option = (int) (Math.random() * 10) % 3;

            if (option == IS_SNAKE) {
                currentPosition = currentPosition - diceNum;
                if (currentPosition < 0) {
                    currentPosition = START_POSITIION;
                    System.out.println("Snake option and player is at " + currentPosition);
                } else {
                   // currentPosition = currentPosition - diceNum;
                System.out.println("Snake option and player is at " + currentPosition);
                }

            } else if (option == IS_LADDER) {
                currentPosition = currentPosition + diceNum;
                if(currentPosition>WINNING_POSITION){
                    currentPosition=currentPosition-diceNum;
                }
                System.out.println("Ladder option and player is at "+currentPosition);
            } else {
                System.out.println("No Play option and player is at "+currentPosition);
            }
        }
        System.out.println("Player won at "+currentPosition+" position");
    }
}
