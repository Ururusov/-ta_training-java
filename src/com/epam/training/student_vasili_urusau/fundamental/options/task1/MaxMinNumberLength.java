package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinNumberLength {

    public static void main(String[] args) {
        ArrayList list = createArray();
        minMaxNumberLength(list);
    }

    public static ArrayList createArray(){
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
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
        System.out.println(list);
        return list;
    }

    public static void minMaxNumberLength(ArrayList<Integer> list){
        int maxValue = 0;
        int minValue = list.get(0);
        int maxL = 0;
        int minL = Integer.toString(Math.abs(list.get(0))).length();
        for (int i = 0; i < list.size(); i++) {
            int a = Integer.toString(Math.abs(list.get(i))).length();
            if( maxL != Integer.max(maxL, a)){
                maxL = Integer.max(maxL, a);
                maxValue = list.get(i);
            }if( minL != Integer.min(minL, a)) {
                minL = Integer.min(minL, a);
                minValue = list.get(i);
            }
        }

        System.out.println("maxValue and minValue " + maxValue + " | " + minValue);
        System.out.println("maxL and minL " + maxL + " | " + minL);

    }

}
