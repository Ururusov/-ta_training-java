package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import com.epam.training.student_vasili_urusau.fundamental.options.UtilMethodInPut;

import java.util.ArrayList;


public class SequenceLength {

    public static void main(String[] args) {
        ArrayList list = UtilMethodInPut.createArray();
        sort(list);
    }


    public static void sort(ArrayList<Integer> array) {
        ArrayList spare = new ArrayList();
        spare.addAll(array);
        int i = 0;
        int goodPairsCounter = 0;
        while (true) {
            if (Integer.toString(Math.abs((Integer) spare.get(i))).length()
                    < Integer.toString(Math.abs((Integer) spare.get(i +1))).length()) {
                int q = (Integer) spare.get(i);
                spare.set(i, spare.get(i + 1));
                spare.set(i + 1, q);
                goodPairsCounter = 0;
            } else {
                goodPairsCounter++;
            }
            i++;
            if (i == spare.size() - 1) {
                i = 0;
            }
            if (goodPairsCounter == spare.size() - 1) break;
        }
        System.out.println(spare);
    }

}
