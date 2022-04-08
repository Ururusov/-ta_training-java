package com.epam.training.student_vasili_urusau.fundamental.main.task;

public class AddAndMultiply {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            product *= Integer.parseInt(args[i]);
        }
        if (args.length > 0) {
            System.out.println("sum = " + sum);
            System.out.println("product = " + product);
        }
    }
}
