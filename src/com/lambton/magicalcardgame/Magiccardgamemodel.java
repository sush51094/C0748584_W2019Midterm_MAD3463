package com.lambton.magicalcardgame;


public class Magiccardgamemodel {

    String firstShuffleColPos;

    String secShuffleColPos;

    String[][] cardList = {{"A", "4", "3"},
            {"K", "7", "2"},
            {"5", "9", "8"}};
    String[][] firstShuffle = null;

    String[][] secShuffle = null;

    String guessedCard;

    public void display() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(cardList[i][j] +" ");

            }
System.out.println();
        }
    }
}