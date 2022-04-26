package com.epam.training.student_vasili_urusau.fundamental.options.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilMatrix {

    public static int enterSizeForMatrix(){
        int n = 0;
        Scanner scan = new Scanner(System.in);
        String str = "Пожалуйста, введите размер матрицы n =";
        System.out.println(str);
         while (scan.hasNext()){
            if (scan.hasNextInt()){
                n = scan.nextInt();
                if (n <= 0) {
                    System.out.println("Если вы хотите остановит программу введите 'exit'");
                    System.out.println("Пожалуйста введите целое положительное число.\n"
                            + n + " это значение не подходит. Попробуйте снова. \n n = ");
                    continue;
                }
                break;
            }else{
                String error = scan.next();
                if (error.equalsIgnoreCase("exit")){
                    System.exit(0);
                }

                 System.out.println("Если вы хотите остановит программу введите 'exit'");
                System.out.println("Пожалуйста введите целое положительное число.\n"
                        + error + " это значение не подходит. Попробуйте снова. \n n = ");
            }
        }
        return n;
    }

    public static int enterRangeForValueInMatrix(){
        int m = 0;
        Scanner scan = new Scanner(System.in);
        String str = "Пожалуйста введите диапазон заначение. Числа будут в диапазоне от -М до M\n M= ";
        System.out.println(str);
        while (scan.hasNext()){
            if (scan.hasNextInt()){
                m = scan.nextInt();
                break;
            }else {
                String error = scan.next();
                if (error.equalsIgnoreCase("exit")){
                    System.exit(0);
                }
                System.out.println("Пожалуйста введите целое число.\n"
                        + error + " это значение не подходит. Попробуйте снова. \n M = ");
            }
        }
        return m;
    }

    public static int[][] createMatrix(int size, int range) {
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) ((Math.random() * 2 - 1) * range);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, Integer range) {
        Integer format = range.toString().length() + 1;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%" + format + "d|", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[] columFromMatrixOfIndex(int[][] matrix, int number) {
        int[] colum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            colum[i] = matrix[i][number];
        }
        return colum;
    }

    public static void printColum(int[] colum, Integer range) {
        Integer format = range.toString().length() + 1;
        for (int i = 0; i < colum.length; i++) {
            System.out.printf("|%" + format + "d|\n", colum[i]);
        }
    }

    public static int foundMaxValueFromLine(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int[][] copyMatrix(int[][] matrix) {
        int[][] copy = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = new int[matrix[i].length];
            System.arraycopy(matrix[i], 0, copy[i], 0, matrix[i].length);
        }
        return copy;
    }

    public static int[][] deleteLineAndColum(int[][] matrix, int numberLine, int numberColum) {
        int l;
        int matrixAfterDelet[][] = new int[matrix.length - 1][matrix.length - 1];
        for (int i = 0; i < matrixAfterDelet.length; i++) {
            if (i < numberLine) {
                l = i;
            } else {
                l = i + 1;
            }
            for (int j = 0; j < matrixAfterDelet.length; j++) {
                if (j < numberColum) {
                    matrixAfterDelet[i][j] = matrix[l][j];
                } else {
                    matrixAfterDelet[i][j] = matrix[l][j + 1];
                }
            }
        }
        return matrixAfterDelet;
    }

    public static int indexLineOfMaxValue(int[][] matrix){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                    index = i;
                }
            }
        }
        return index;
    }

    public static int indexColumOfMaxValue(int[] line){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i] > max){
                max = line[i];
                index = i;
            }
        }
        return index;
    }

    public static List<Integer> sequenceDownInLine(int[][] matrix){
        List maxSequence = new ArrayList<Integer>();
        List sequence = new ArrayList<Integer>();
        sequence.clear();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1 ; j++) {
                if (matrix[i][j] > matrix[i][j + 1]){
                    if (sequence.size() == 0){
                        sequence.add(matrix[i][j]);
                        sequence.add(matrix[i][j + 1]);
                    }else {
                        sequence.add(matrix[i][j + 1]);
                    }
                } else if (sequence.size() > maxSequence.size()){
                    maxSequence.clear();
                    maxSequence.addAll(0, sequence);
                    sequence.clear();

                }else {
                    sequence.clear();
                }
            }
        }
        return maxSequence;
    }

    public static List<Integer> sequenceUpInLine(int[][] matrix){
        List maxSequence = new ArrayList<Integer>();
        List sequence = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            sequence.clear();
            for (int j = 0; j < matrix[0].length - 1 ; j++) {
                if (matrix[i][j] < matrix[i][j + 1]){
                    if (sequence.size() == 0){
                        sequence.add(matrix[i][j]);
                        sequence.add(matrix[i][j + 1]);
                    }else {
                        sequence.add(matrix[i][j + 1]);
                    }
                } else if (sequence.size() > maxSequence.size()){
                    maxSequence.clear();
                    maxSequence.addAll(0, sequence);
                    sequence.clear();
                }else {
                    sequence.clear();
                }
            }
        }
        return maxSequence;
    }


}
