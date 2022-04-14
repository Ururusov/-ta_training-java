package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMethodInPut;

import java.util.List;

public class SequenceDigits {

    public static void main(String[] args) {
        List arrayList = UtilMethodInPut.createArray();
        haveSequence(arrayList);
    }


    public static void haveSequence(List<Integer> arrayList){
        int i = 0;
        while (i < arrayList.size()){
            char[] digits = Integer.toString(Math.abs(arrayList.get(i))).toCharArray();
            int sequence = 0;
            int j = 0;
            while (j < digits.length - 1){
                if (digits[j] < digits[j + 1]){
                    sequence++;
                }else break;
                if (sequence == digits.length - 1){
                    System.out.println("Number " + arrayList.get(i) + " have a sequence");
                    System.exit(0);
                }
                j++;
            }
            i++;
        }
        System.out.println("Array doesn't have number with an up sequence");
    }
}
