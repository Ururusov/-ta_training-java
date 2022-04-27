package com.epam.training.student_vasili_urusau.fundamental.options.task2.delete;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMatrix;

import java.util.Arrays;

public class DeleteLineAndColum {
    public static void main(String[] args) {
        int n = UtilMatrix.enterSizeForMatrix();
        int m = UtilMatrix.enterRangeForValueInMatrix();
        int [][] matrix = UtilMatrix.createMatrix(n,m);
        int numberLine = UtilMatrix.indexLineOfMaxValue(matrix);
        int numberColum = UtilMatrix.indexColumOfMaxValue(matrix[numberLine]);
        int [] columMax = UtilMatrix.columFromMatrixOfIndex(matrix, numberColum);
        int max = matrix[numberLine][numberColum];
        int [][] matrixResult = UtilMatrix.deleteLineAndColum(matrix, numberLine, numberColum);
        ResultMatrix obj = new ResultMatrix(m, matrix, numberLine, numberColum, columMax, max, matrixResult);


        System.out.println("Исходная матрица");
        UtilMatrix.printMatrix(matrix,m);
        System.out.println("------------------------");
        System.out.println("максимальный элемент = " + max);
        System.out.println("координаты: строка № = " + numberLine
                + "; столбец № = " + numberColum + ";");
        System.out.println("строка с максимальным элементом " + Arrays.toString(matrix[numberLine]));
        System.out.println("столбец с максимальным элементом ");
        UtilMatrix.printColum(columMax, m);
        System.out.println("-------------------------");
        System.out.println("Матрица после удаления строки и столбца");
        UtilMatrix.printMatrix(matrixResult, m);
        System.out.println("------------------------");


    }
}
