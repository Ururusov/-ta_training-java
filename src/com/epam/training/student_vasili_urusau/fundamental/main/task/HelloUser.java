package com.epam.training.student_vasili_urusau.fundamental.main.task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloUser {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Hello, ");
            for (int i = 0; i < args.length; i++) {
                if(i == args.length - 1){
                    System.out.print(args[i]);
                }else System.out.print(args[i] + " ");
            }
            System.out.println("!\n How are You?");
        }
    }
}
