package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceDigits {

    public static void main(String[] args) {
        ArrayList arrayList = createArray();
        haveSequence(arrayList);
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

    public static void haveSequence(ArrayList<Integer> arrayList){
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
