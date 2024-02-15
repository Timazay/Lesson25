package by.itstep.lesson25.task01.model;

public class MatrixLogic {
    public static boolean isMagicSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0
                || matrix[0].length == 0 || matrix.length != matrix[0].length){
            return false;
        }

        boolean check = true;
        int length = matrix.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += matrix[0][i];
        }

        for (int i = 1; i < length; i++) {
            int eachSum = 0;
            for (int j = 0; j < length; j++) {
                eachSum += matrix[i][j];
            }
            if (eachSum != sum) {
                check = false;
            }
        }

        for (int i = 0; i < length; i++) {
            int columnSum = 0;
            for (int j = 0; j < length; j++) {
                columnSum += matrix[j][i];
            }
            if (columnSum != sum) {
                check = false;
            }
        }

        int mainDiagSum = 0;
        for (int i = 0; i < length; i++) {
            mainDiagSum += matrix[i][i];
        }
        if (mainDiagSum != sum) {
            check = false;
        }

        int sideDiagSum = 0;
        for (int i = 0; i < length; i++) {
            sideDiagSum += matrix[i][length - 1 - i];
        }
        if (sideDiagSum != sum) {
            check = false;
        }

        return check;
    }
}
