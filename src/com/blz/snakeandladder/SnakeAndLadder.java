package com.blz.snakeandladder;

public class SnakeAndLadder {
    public static final int START_POSITION = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static final int WINNING_POSITION = 100;
    public static String turn="player1";

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int currentPositionOfPlayer1 = START_POSITION;
        int currentPositionOfPlayer2 = START_POSITION;
        int dice = 0;

        while (currentPositionOfPlayer1 < WINNING_POSITION && currentPositionOfPlayer2 < WINNING_POSITION) {
            dice++;
            if(turn.equals("player1")){
                currentPositionOfPlayer1 = getPosition(currentPositionOfPlayer1);
                turn="player2";
            }
            else{
                currentPositionOfPlayer2 = getPosition(currentPositionOfPlayer2);
                turn="player1";
            }
        }
        System.out.println("Player1 is at " + currentPositionOfPlayer1 + " position and " + dice + " times dice was rolled");
        System.out.println("Player2 is at " + currentPositionOfPlayer2 + " position and " + dice + " times dice was rolled");
        if(currentPositionOfPlayer1==WINNING_POSITION){
            System.out.println("Player1 won the Game");
        }else{
            System.out.println("Player2 won the Game");
        }
    }

    private static int getPosition(int currentPosition) {
            int diceNum = (int) (Math.random() * 10) % 6 + 1;
            int option = (int) (Math.random() * 10) % 3;

            if (option == IS_SNAKE) {
                if (currentPosition-diceNum > 0) {
                    currentPosition -= diceNum;
                }
            } else if (option == IS_LADDER) {
                if (currentPosition + diceNum <= WINNING_POSITION) {
                    currentPosition += diceNum;
                }
                if(turn.equals("player1")){
                    turn="player1";
                    System.out.println("Player1 got the ladder");
                }else if(turn.equals("player2")){
                    turn="player2";
                    System.out.println("Player2 got the ladder");
                }
            } else {
            }
            return currentPosition;
        }

    }
