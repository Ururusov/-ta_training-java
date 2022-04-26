package com.epam.training.student_vasili_urusau.fundamental.options.task2;

public class Test {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4};
        System.out.println();
        int [][] matrix = UtilMatrix.createMatrix(7,30);
        int numberLine = UtilMatrix.indexLineOfMaxValue(matrix);
        int numberColum = UtilMatrix.indexColumOfMaxValue(matrix[numberLine]);
        int max = matrix[numberLine][numberColum];
        int [][] matrixResult = UtilMatrix.deleteLineAndColum(matrix, numberLine, numberColum);
    }

}
