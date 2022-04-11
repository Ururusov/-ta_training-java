package com.epam.training.student_vasili_urusau.fundamental.options.task2;

import com.epam.training.student_vasili_urusau.fundamental.options.UtilMethodInPut;

import java.util.Arrays;

public class DeleteLineAndColum {
    public static void main(String[] args) {
        int[][] matrix = UtilMethodInPut.createMatrix();
        UtilMethodInPut.matrixToString(matrix);

        UtilMethodInPut.matrixToString(removeLineAndColum(matrix));
    }

    public static int[][] removeLineAndColum(int[][] matrix){
        int l = 0;
        int maxLine = 0;
        int maxColum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    maxColum = j;
                    maxLine = i;
                }
            }
        }
        System.out.println("максимальное число = " + max + "\nНомер строки " + maxLine);
        System.out.println(Arrays.toString(matrix[maxLine]));
        System.out.println("Номер столбца " + maxColum);
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("|%5d|\n", matrix[i][maxColum]);
        }
        System.out.println("массив с удаленными столбцами и стоками \n");

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
        return matrixResult;
    }
}
