package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMethodInPut;

import java.util.List;

public class MaxMinNumberLength {

    public static void main(String[] args) {
        List list = UtilMethodInPut.createArray();
        minMaxNumberLength(list);
    }


    public static void minMaxNumberLength(List<Integer> list){
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
