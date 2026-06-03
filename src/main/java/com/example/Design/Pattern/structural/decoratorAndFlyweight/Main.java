package com.example.Design.Pattern.structural.decoratorAndFlyweight;

public class Main {

    public static void main(String[] args) {

        ChessUserFlyWeightRegistry chessUserFlyWeightRegistry = new ChessUserFlyWeightRegistry();

        ChessUserIntrinsicState viratUser =
            new ChessUserIntrinsicState("Virat", 36, "Male", "virat@yopmail.com");

        chessUserFlyWeightRegistry.add("virat", viratUser);

        ChessUserExtrinsicState game1 = new ChessUserExtrinsicState("101", "E3", 250, viratUser);
        ChessUserExtrinsicState game2 = new ChessUserExtrinsicState("102", "D1", 100, viratUser);

        System.out.println(game1.getChessUserIntrinsicState().getName() + "::" + game1);
        System.out.println(game2.getChessUserIntrinsicState().getName() + "::" + game2);

    }
}
