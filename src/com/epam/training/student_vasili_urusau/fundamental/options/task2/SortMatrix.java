package com.epam.training.student_vasili_urusau.fundamental.options.task2;

import com.epam.training.student_vasili_urusau.fundamental.options.UtilMethodInPut;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

public class SortMatrix {
    public static void main(String[] args) {
        int matrix[][] = UtilMethodInPut.createMatrix();
        matrixToString(matrix);
        matrixToString(sortMatrix(matrix));
    }

    public static int[][] sortLine(int[][] matrix) {
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
                    scan.close();
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
        return copy;
    }

    public static int[][] sortColum(int[][] matrix) {
        int n = 0;
        int goodPairsCounter = 0;
        int [][] copy = matrix;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        String str = "Пожалуйста, введите номер столбца для сортировки\nОт 0 до " + (copy[0].length - 1) + " включительно";
        System.out.println(str);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n >= 0 && n < copy[0].length) {
                    scan.close();
                    break;
                } else {
                    String error = scan.next();
                    System.out.println("Пожалуйста, введите целое число от 0 до" + (copy[0].length - 1) + " включительно.\n"
                            + error + " это значение не подходит. Попробуйте снова. \n Введите номер столбца ");
                }
            }
        }
        while (true){
            if (copy[i][n] > copy[i + 1][n]){
                for (int j = 0; j < copy[0].length; j++) {
                    int f = copy[i][j];
                    copy[i][j] = copy[i + 1][j];
                    copy[i + 1][j] = f;
                    goodPairsCounter = 0;
                }
            }else {
                goodPairsCounter++;
            } i++;
            if (i == copy[0].length -1){
                i = 0;
            } if ( goodPairsCounter == copy[0].length - 1){
                break;
            }
        }
        return copy;
    }

    private static void showErrorMessage(String errorText) {
        System.out.println(errorText + " Попробуйте ввести свой выбор еще раз.");
        System.out.println("------------------------------------------------------------");
    }



    public static int enterSelection(){
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки по строке(введите 0) или по столбцу(введите 1)");
        System.out.print("Введите ваш выбор: ");
        try{
            selection = scanner.nextInt();
        }catch (InputMismatchException e ){
            showErrorMessage("Присутствуют посторонние символы");
            selection = enterSelection();
        }
        if (selection != 0 && selection != 1){
            showErrorMessage("Нет такого выбора!");
            selection = enterSelection();
        }
        return selection;
    }

    public static int[][] sortMatrix(int[][] matrix){
        int[][] copy;
        if (enterSelection() == 0){
            copy = sortLine(matrix);
        }else {
            copy = sortColum(matrix);
        }
        return copy;
    }

    public static void matrixToString(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%5d|" ,matrix[i][j]);
            }
            System.out.println("");
        }

    }
}