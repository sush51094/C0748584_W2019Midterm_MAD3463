package com.lambton.magicalcardgame;


public class Magiccardgamemodel  {

    String firstShuffleColPos;

    String secShuffleColPos;

    String[][] cardList = {{"A", "4", "3"},
            {"K", "7", "2"},
            {"5", "9", "8"}};
    String[][] firstShuffle = null;

    String[][] secShuffle = null;

    String guessedCard;

    public String getFirstShuffleColPos() {
        return firstShuffleColPos;
    }

    public void setFirstShuffleColPos(String firstShuffleColPos) {
        this.firstShuffleColPos = firstShuffleColPos;
    }

    public String getSecShuffleColPos() {
        return secShuffleColPos;
    }

    public void setSecShuffleColPos(String secShuffleColPos) {
        this.secShuffleColPos = secShuffleColPos;
    }

    public String[][] getCardList() {
        return cardList;
    }

    public void setCardList(String[][] cardList) {
        this.cardList = cardList;
    }

    public String[][] getFirstShuffle() {
        return firstShuffle;
    }

    public void setFirstShuffle(String[][] firstShuffle) {
        this.firstShuffle = firstShuffle;
    }

    public String[][] getSecShuffle() {
        return secShuffle;
    }

    public void setSecShuffle(String[][] secShuffle) {
        this.secShuffle = secShuffle;
    }

    public String getGuessedCard() {
        return guessedCard;
    }

    public void setGuessedCard(String guessedCard) {
        this.guessedCard = guessedCard;
    }

    public void display() {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(cardList[i][j] +" ");

            }
System.out.println();
        }

     }
    }
