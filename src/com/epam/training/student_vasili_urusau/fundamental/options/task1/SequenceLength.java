package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMethodInPut;

import java.util.ArrayList;
import java.util.List;


public class SequenceLength {

    public static void main(String[] args) {
        List list = UtilMethodInPut.createArray();
        sort(list);
    }


    public static void sort(List<Integer> array) {
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
