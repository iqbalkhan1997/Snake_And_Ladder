package com.blz.snakeandladder;

public class SnakeAndLadder {

    public static void main(String[] args) {
            System.out.println("Welcome to Snake and Ladder Game");
            int startPosition=0;
        System.out.println("Player is at "+startPosition+" position");
        int diceNum=(int)(Math.random() * 10) % 6 + 1;
        System.out.println("die value is "+diceNum);
    }
}
