package com.epam.training.student_vasili_urusau.fundamental.options;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilMethodInPut {

    public static List createArray(){
        Scanner scan = new Scanner(System.in);
        List list = new ArrayList();
        System.out.println("Accept numbers, for ending accept 'ok'");
        while (scan.hasNext()){
            if(scan.hasNextInt()){
                list.add(scan.nextInt());
            }else {
                String str = scan.next();
                if (str.equals("ok")) {
                    System.out.println("array accepted");
                    break;
                }
            }
        }
        scan.close();
        return list;
    }
    public static int[][] createMatrix(){
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int m = 0;

        String str = "Пожалуйста, введите размер матрицы n =";
        System.out.println(str);
        while (scan.hasNext()){
            if (scan.hasNextInt()){
                n = scan.nextInt();
                break;
            }else {
                String error = scan.next();
                System.out.println("Пожалуйста введите целое число.\n"
                        + error + " это значение не подходит. Попробуйте снова. \n n = ");
            }
        }
        str = "Пожалуйста введите диапазон заначение. Числа будут в диапазоне от -М до M\n M= ";
        System.out.println(str);
        while (scan.hasNext()){
            if (scan.hasNextInt()){
                m = scan.nextInt();
                break;
            }else {
                String error = scan.next();
                System.out.println("Пожалуйста введите целое число.\n"
                        + error + " это значение не подходит. Попробуйте снова. \n M = ");
            }
        }
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) ((Math.random()*2 - 1)*m);
            }
        }
        return matrix;
    }
    public static void matrixToString(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%5d|", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
