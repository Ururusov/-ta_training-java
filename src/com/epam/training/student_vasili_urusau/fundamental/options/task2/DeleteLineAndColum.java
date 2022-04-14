package com.epam.training.student_vasili_urusau.fundamental.options.task2;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMatrix;
import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMethodInPut;

import java.util.Arrays;

public class DeleteLineAndColum {
    public static void main(String[] args) {
        UtilMatrix matrix = UtilMethodInPut.createMatrix();
        System.out.println("Исходная матрица");
        matrix.matrixToString();
        System.out.println("------------------------");
        UtilMatrix matrixResult = DeleteLineAndColum.removeLineAndColum(matrix);
        System.out.println("максимальный элемент = " + matrixResult.getMaxValue());
        System.out.println("координаты: строка № = " + matrixResult.getNumberLineMaxValue()
                + "; столбец № = " + matrixResult.getNumberColumMaxValue() + ";");
        System.out.println("строка с максимальным элементом " + Arrays.toString(matrixResult.getLineWhereMaxValue()));
        System.out.println("столбец с максимальным элементом ");
        matrixResult.columToString();
        System.out.println("-------------------------");
        System.out.println("Матрица после удаления строки и столбца");
        matrixResult.matrixToString();
        System.out.println("------------------------");
    }

    public static UtilMatrix removeLineAndColum(UtilMatrix m){
        UtilMatrix utilMatrix;
        int l;
        int maxLine = 0;
        int maxColum = 0;
        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;
        int[][] matrix = m.getMatrix();
        int[] maxColumValue = new int[matrix.length];
        int[] maxLineValue;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    maxColum = j;
                    maxLine = i;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            maxColumValue[i] = matrix[i][maxColum];
        }

        maxLineValue = matrix[maxLine];

        int matrixResult[][] = new int[matrix.length - 1][matrix.length - 1];
        for (int i = 0; i < matrixResult.length; i++) {
            if(i < maxLine){
                l = i;
            }else {
                l = i + 1;
            }
            for (int j = 0; j < matrixResult.length; j++) {
                if (j < maxColum){
                    matrixResult[i][j] = matrix[l][j];
                }else {
                    matrixResult[i][j] = matrix[l][j + 1];
                }
            }
        }

        for (int i = 0; i < matrixResult.length; i++) {
            for (int j = 0; j < matrixResult.length; j++) {
                if (maxSecond < matrix[i][j]){
                    maxSecond = matrix[i][j];
                }
            }
        }

        utilMatrix = new UtilMatrix(matrixResult, max, maxLine, maxColum, maxLineValue, maxColumValue);
        return utilMatrix;
    }
}
