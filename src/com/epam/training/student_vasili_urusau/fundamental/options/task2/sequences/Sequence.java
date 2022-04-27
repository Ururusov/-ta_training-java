package com.epam.training.student_vasili_urusau.fundamental.options.task2.sequences;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMatrix;

import java.util.*;

public class Sequence {
    public static void main(String[] args) {
        int size = UtilMatrix.enterSizeForMatrix();
        int range = UtilMatrix.enterRangeForValueInMatrix();
        int [][] matrix = UtilMatrix.createMatrix(size, range);
        int selection = enterSelection();
        List<Integer> sequence;
        if (selection == 0){
            sequence = UtilMatrix.sequenceUpInLine(matrix);
            System.out.println("Вы выбрали последовательность по возрастанию.");
        }else {
            sequence = UtilMatrix.sequenceDownInLine(matrix);
            System.out.println("Вы выбрали последовательность по убыванию.");
        }
        ResultSequence resultSequence = new ResultSequence(matrix, range, sequence);
        System.out.println("Исходная матрица");
        UtilMatrix.printMatrix(matrix, range);
        System.out.println("\nМаксимальная последовательность в этой маттрице приведена ниже.");
        System.out.println(sequence);
    }



    private static void showErrorMessage(String errorText) {
        System.out.println(errorText + " Попробуйте ввести свой выбор еще раз.");
        System.out.println("------------------------------------------------------------");
    }

    public static int enterSelection(){
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите последовательность возрастающая(введите 0) или убывающая(введите 1)\n" +
                "Если хотите завершить приграмму (введите 2)");
        System.out.print("Введите ваш выбор: ");
        try{
            selection = scanner.nextInt();
        }catch (InputMismatchException e ){
            showErrorMessage("Присутствуют посторонние символы.");
            selection = enterSelection();
        }
        if(selection == 2){
            System.exit(0);
        }
        if (selection != 0 && selection != 1){
            showErrorMessage("Для старта введите 0 или 1");
            selection = enterSelection();
        }
        return selection;
    }

}
