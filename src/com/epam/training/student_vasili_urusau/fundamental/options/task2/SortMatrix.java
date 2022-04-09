package com.epam.training.student_vasili_urusau.fundamental.options.task2;

import com.epam.training.student_vasili_urusau.fundamental.options.UtilMethodInPut;

import java.util.Scanner;

public class SortMatrix {
    public static void main(String[] args) {
        int matrix[][] = UtilMethodInPut.createMatrix();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%5d|" ,matrix[i][j]);
            }
            System.out.println("");
        }
        sortMatrixForLine(matrix);
    }

    public static void sortMatrixForLine(int[][] matrix) {
        int n = 0;
        int goodPairsCounter = 0;
        int [][] copy = matrix;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        String str = "Пожалуйста, введите номер строки для сортировки\nОт 0 до " + (matrix.length - 1) + " включительно";
        System.out.println(str);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n >= 0 && n < matrix.length) {
                    break;
                } else {
                    String error = scan.next();
                    System.out.println("Пожалуйста, введите целое число от 0 до" + (matrix.length - 1) + " включительно.\n"
                            + error + " это значение не подходит. Попробуйте снова. \n Введите номер строки ");
                }
            }
        }
        while (true){
            if (copy[n][i] > copy[n][i + 1]){
                for (int j = 0; j < copy.length; j++) {
                    int f = copy[j][i];
                    copy[j][i] = copy[j][i + 1];
                    copy[j][i + 1] = f;
                    goodPairsCounter = 0;
                }
            }else {
                goodPairsCounter++;
            } i++;
            if (i == matrix.length -1){
                i = 0;
            } if ( goodPairsCounter == matrix.length - 1){
                break;
            }
        }
        for (int k = 0; k < copy.length; k++) {
            System.out.print("|");
            for (int j = 0; j < copy.length; j++) {
                System.out.printf("%5d|" ,copy[k][j]);
            }
            System.out.println("");
        }
    }
}