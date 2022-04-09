package com.epam.training.student_vasili_urusau.fundamental.options.task2;

import com.epam.training.student_vasili_urusau.fundamental.options.UtilMethodInPut;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int matrix[][] = UtilMethodInPut.createMatrix();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%5d|" ,matrix[i][j]);
            }
            System.out.println("");
        }
         matrix = new int[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = (int) ((Math.random()*2 - 1)*10);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("| "+ matrix[i][j]+ " |");
            }
        }

    }
}
