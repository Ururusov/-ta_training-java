package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMethodInPut;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        List arrayList = UtilMethodInPut.createArray();
        oddDigits(arrayList);

        // System.out.println(arrayList.get(0).getClass());
    }



    public static void oddDigits(List<Integer> arrayList) {
        int totalOdd = 0;
        int totalOddHalf = 0;
        ArrayList odd = new ArrayList<>();
        ArrayList oddHalf = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String strNumber = Integer.toString(Math.abs(arrayList.get(i)));
            char[] charsNumbers = strNumber.toCharArray();
            int quantityOddDigits = 0;
            for (int j = 0; j < charsNumbers.length; j++) {
                int digit = charsNumbers[j];
                if (digit % 2 == 0) quantityOddDigits++;
            }
            if (charsNumbers.length == quantityOddDigits) {
                totalOdd++;
                odd.add(arrayList.get(i));
            } else if (quantityOddDigits > 0) {
                double divide = charsNumbers.length / quantityOddDigits;
                if (divide == 2) {
                    totalOddHalf++;
                    oddHalf.add(arrayList.get(i));
                }
            }
        }
        System.out.println("quantity numbers have odd digits { " + totalOdd + " }\n"
                    + "These numbers are " + odd);
        System.out.println("quantity numbers have half odd digits { " + totalOddHalf + " }\n"
                    + "These number are " + oddHalf);

    }
}