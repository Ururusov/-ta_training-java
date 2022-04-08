package com.epam.training.student_vasili_urusau.fundamental.main.task;

public class RandomArray {
    public static void main(String[] args) {

        if (args.length != 0 && Integer.parseInt(args[0]) > 0) {
            int size = Integer.parseInt(args[0]);
            int array[] = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100 - 50);
            }
            System.out.println("--------");
            for (int value : array) {
                System.out.println(value);
            }
            System.out.println("--------");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println("\n--------");
        }
    }
}

