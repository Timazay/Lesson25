package by.itstep.lesson25.task01.controller;

import by.itstep.lesson25.task01.model.MatrixLogic;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };



        if (MatrixLogic.isMagicSquare(matrix)){
            System.out.println("It is magic square");
        } else {
            System.out.println("It is not magic square");
        }
    }
}
