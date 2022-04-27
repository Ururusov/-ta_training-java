package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMethodInPut;

import java.util.List;

public class DifferentDigits {
    public static void main(String[] args) {
        List arrayList = UtilMethodInPut.createArray();
        differentDigits(arrayList);
    }


    public static void differentDigits(List<Integer> list){
        int k = 0;
        while (k < list.size()) {
            char charNumber[] = Integer.toString(Math.abs(list.get(k))).toCharArray();
            boolean patterns = false;
            int i = 0;
            while (i < charNumber.length -1){
                int j = i + 1;
                while (j < charNumber.length){
                    if(charNumber[j] == charNumber[i]){
                        patterns = true;
                        break;
                    }
                   j++;
                }
                if (patterns)break;
                i++;
                if (i == charNumber.length - 1) {
                    System.out.println("This number" + list.get(k) + " have different digits");
                    System.exit(0);
                }
            }
            k++;
        }

    }

}
