package com.epam.training.student_vasili_urusau.fundamental.options.task2.sort;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMatrix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortMatrix {
    public static void main(String[] args) {
        int size = UtilMatrix.enterSizeForMatrix();
        int range = UtilMatrix.enterRangeForValueInMatrix();
        int [][] matrix = UtilMatrix.createMatrix(size, range);
        ResultSort resultSort = new ResultSort(matrix);
        UtilMatrix.printMatrix(matrix, range);
        matrix = sortMatrix(matrix);
        resultSort.setMatrixSort(matrix);
        System.out.println("------------------------------");
        UtilMatrix.printMatrix(resultSort.getMatrixSort(), range);
    }


    public static int[][] sortMatrix(int[][] matrix){
        if (enterSelection() == 0){
            matrix = UtilMatrix.bubbleSortLine(matrix, choiceNumberLine(matrix));
        }else {
            matrix = UtilMatrix.bubbleSortColum(matrix, choiceNumberColum(matrix));
        }
        return matrix;
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

    private static void showErrorMessage(String errorText) {
        System.out.println(errorText + " Попробуйте ввести свой выбор еще раз.");
        System.out.println("------------------------------------------------------------");
    }

    private static int choiceNumberColum(int[][] matrix){
        int number = 0;
        Scanner scan = new Scanner(System.in);
        String str = "Пожалуйста, введите номер столбца для сортировки\nОт 0 до " + (matrix[0].length - 1) + " включительно";
        System.out.println(str);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number >= 0 && number < matrix[0].length) {
                    break;
                } else {
                    String error = scan.next();
                    System.out.println("Пожалуйста, введите целое число от 0 до" + (matrix[0].length - 1) + " включительно.\n"
                            + error + " это значение не подходит. Попробуйте снова. \n Введите номер столбца ");
                }
            }
        }
        return number;
    }

    private static int choiceNumberLine(int[][] matrix){
        int number = 0;
        Scanner scan = new Scanner(System.in);
        String str = "Пожалуйста, введите номер строки для сортировки\nОт 0 до " + (matrix.length - 1) + " включительно";
        System.out.println(str);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                number = scan.nextInt();
                if (number >= 0 && number < matrix.length) {
                    break;
                } else {
                    String error = scan.next();
                    System.out.println("Пожалуйста, введите целое число от 0 до" + (matrix.length - 1) + " включительно.\n"
                            + error + " это значение не подходит. Попробуйте снова. \n Введите номер строки ");
                }
            }
        }
        return number;
    }
}