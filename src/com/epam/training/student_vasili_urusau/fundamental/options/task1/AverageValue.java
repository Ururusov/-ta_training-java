package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMethodInPut;

import java.util.List;

public class AverageValue {
    public static void main(String[] args) {
        List arrayList = UtilMethodInPut.createArray();
        average(arrayList);
    }


    public static void average(List<Integer> arrayList){
        double averageLength;
        int sum = 0 ;
        for (int i = 0; i < arrayList.size(); i++)
            sum += Integer.toString(Math.abs(arrayList.get(i))).length();
        averageLength = Math.ceil((double) sum /(double) arrayList.size());
        System.out.println("Average length = " + averageLength +
                "; sumLengthNumber/quantityNumber = " + sum + "/" + arrayList.size());
        System.out.println("Number for length ander average");
        for (int i = 0; i < arrayList.size(); i++) {
            if(averageLength >
                    Integer.toString(Math.abs(arrayList.get(i))).length()){
                int lengthNumber = Integer.toString(Math.abs(arrayList.get(i))).length();
                System.out.println("value = " + arrayList.get(i) +"; length = " + lengthNumber + ";");
            }
        }
    }
}
