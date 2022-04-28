package com.epam.training.student_vasili_urusau.fundamental.options.util;

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
                System.out.println("Если вы хотите остановит программу введите 'exit'");
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
        int matrixAfterDelete[][] = new int[matrix.length - 1][matrix.length - 1];
        for (int i = 0; i < matrixAfterDelete.length; i++) {
            if (i < numberLine) {
                l = i;
            } else {
                l = i + 1;
            }
            for (int j = 0; j < matrixAfterDelete.length; j++) {
                if (j < numberColum) {
                    matrixAfterDelete[i][j] = matrix[l][j];
                } else {
                    matrixAfterDelete[i][j] = matrix[l][j + 1];
                }
            }
        }
        return matrixAfterDelete;
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
        for (int i = 0; i < matrix.length; i++) {
            sequence.clear();
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

    public static void bubbleSortColum(int[][] matrix, int number) {
        int goodPairsCounter = 0;
        int i = 0;

        while (true){
            if (matrix[i][number] > matrix[i + 1][number]){
                for (int j = 0; j < matrix[0].length; j++) {
                    int f = matrix[i][j];
                    matrix[i][j] = matrix[i + 1][j];
                    matrix[i + 1][j] = f;
                    goodPairsCounter = 0;
                }
            }else {
                goodPairsCounter++;
            } i++;
            if (i == matrix[0].length -1){
                i = 0;
            } if ( goodPairsCounter == matrix[0].length - 1){
                break;
            }
        }
    }

    public static void bubbleSortLine(int[][] matrix, int number) {
        int goodPairsCounter = 0;
        int i = 0;

        while (true){
            if (matrix[number][i] > matrix[number][i + 1]){
                for (int j = 0; j < matrix.length; j++) {
                    int f = matrix[j][i];
                    matrix[j][i] = matrix[j][i + 1];
                    matrix[j][i + 1] = f;
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
    }

    public static void quickSortLineWithMatrix(int[][] matrix, int number){
        recQuickSort(matrix, number, 0, matrix[number].length - 1);
        bubbleSortLine(matrix, number);
    }

    public static void recQuickSort(int[][] matrix, int number, int left, int right){
        int size = right - left + 1;
        if (size > 3){
            int median = medianOf3(matrix, number, left, right);
            int partition = partitionIt(matrix, number, left, right, median);
            recQuickSort(matrix, number, left, partition - 1);
            recQuickSort(matrix, number, partition + 1, right);
        }

    }

     private static int medianOf3(int[][] matrix, int number, int left, int right){
        int center = (left + right) / 2;
        if (matrix[number][left] > matrix[number][center]){
            swapAllColumInMatrix(matrix, number, left, center);
        }
        if (matrix[number][left] > matrix[number][right]){
            swapAllColumInMatrix(matrix, number, left, right);
        }
        if (matrix[number][center] > matrix[number][right]){
            swapAllColumInMatrix(matrix, number, center, right);
        }
        swapAllColumInMatrix(matrix, number, center, right-1);
        return matrix[number][right -1];
    }

    private static int partitionIt(int[][] matrix, int number, int left, int right, int pivot){
        int leftPtr = left;
        int rightPtr = right - 1;
            while(true){
                 while(matrix[number][++leftPtr] < pivot){

                 }
                 while (matrix[number][--rightPtr] > pivot){

                 }
                 if (leftPtr > rightPtr){
                     break;
                 }else {
                     swapAllColumInMatrix(matrix, number, leftPtr, rightPtr);
                 }
            }
        swapAllColumInMatrix(matrix, number, leftPtr, right - 1);
        return leftPtr;
    }

    public static void swapAllColumInMatrix(int[][] matrix, int number, int dex1, int dex2){
        for (int i = 0; i < matrix[number].length; i++) {
            int temp = matrix[i][dex1];
            matrix[i][dex1] = matrix[i][dex2];
            matrix[i][dex2] = temp;
        }
    }

}
