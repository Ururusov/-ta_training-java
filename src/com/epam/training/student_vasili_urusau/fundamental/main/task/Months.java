package com.epam.training.student_vasili_urusau.fundamental.main.task;

public class Months {
    public static void main(String[] args) {
        if(args.length == 0){
            System.exit(0);
            }
        for (int i = 0; i < args.length; i++) {
            switch (args[i]){
                  case "12":
                      System.out.println(args[i] + " December");
                      break;
                  case "1":
                      System.out.println(args[i] + " January");
                      break;
                  case "2":
                      System.out.println(args[i] + " February");
                      break;
                  case "3":
                      System.out.println(args[i] + " March");
                      break;
                  case "4":
                      System.out.println(args[i] + " April");
                      break;
                  case "5":
                      System.out.println(args[i] + " May");
                      break;
                  case "6":
                      System.out.println(args[i] + " June");
                      break;
                  case "7":
                      System.out.println(args[i] + " July");
                      break;
                  case "8":
                      System.out.println(args[i] + " August");
                      break;
                  case "9":
                      System.out.println(args[i] + " September");
                      break;
                  case "10":
                      System.out.println(args[i] + " October");
                      break;
                  case "11":
                      System.out.println(args[i] + " November");
                      break;
                  default:
                      System.out.println(args[i] + " wrong... Month isn't");
            }
        }
    }
}
