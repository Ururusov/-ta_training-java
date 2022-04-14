package com.epam.training.student_vasili_urusau.fundamental.options.util;

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
    public static UtilMatrix createMatrix(){
        Scanner scan = new Scanner(System.in);
        UtilMatrix utilMatrix;
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
        utilMatrix = new UtilMatrix(m, matrix);
        return utilMatrix;
    }

}
