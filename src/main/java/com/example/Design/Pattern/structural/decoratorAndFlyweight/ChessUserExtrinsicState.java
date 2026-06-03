package com.example.Design.Pattern.structural.decoratorAndFlyweight;

@ExtrinsicState
public class ChessUserExtrinsicState {

    private String gameId;
    private String currentPosition;
    private int timeRemaining;
    private ChessUserIntrinsicState chessUserIntrinsicState;

    public ChessUserExtrinsicState(String gameId, String currentPosition, int timeRemaining,
        ChessUserIntrinsicState chessUserIntrinsicState) {
        this.gameId = gameId;
        this.currentPosition = currentPosition;
        this.timeRemaining = timeRemaining;
        this.chessUserIntrinsicState = chessUserIntrinsicState;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public ChessUserIntrinsicState getChessUserIntrinsicState() {
        return chessUserIntrinsicState;
    }

    public void setChessUserIntrinsicState(
        ChessUserIntrinsicState chessUserIntrinsicState) {
        this.chessUserIntrinsicState = chessUserIntrinsicState;
    }

    @Override
    public String toString() {
        return "ChessUserExtrinsicState{" +
            "gameId='" + gameId + '\'' +
            ", currentPosition='" + currentPosition + '\'' +
            ", timeRemaining=" + timeRemaining +
            ", chessUserIntrinsicState=" + chessUserIntrinsicState +
            '}';
    }
}
