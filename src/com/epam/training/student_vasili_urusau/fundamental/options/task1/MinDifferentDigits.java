package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MinDifferentDigits {

    public static void main(String[] args) {
        ArrayList arrayList = createArray();
        differentDigits(arrayList);

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

    public static void differentDigits(ArrayList<Integer> list){
        int k = 0;
        int minDigits = 10;//Integer.MAX_VALUE;
        int minNumber = 0;
        char minArrayDigits[] = new char[0];
        while (k < list.size()) {
            String strNumber;
            strNumber = Integer.toString(Math.abs(list.get(k)));
            char charNumber[] = strNumber.toCharArray();
            char arrayDigits[] = new char[1];
            arrayDigits[0] = charNumber[0];

            for (int i = 1; i < charNumber.length; i++) {
                int j = 0;
                while (j < arrayDigits.length) {
                    if (charNumber[i] == arrayDigits[j]) {
                        break;
                    }
                    if (j == arrayDigits.length - 1) {
                        char spare[] = new char[arrayDigits.length + 1];
                        System.arraycopy(arrayDigits, 0, spare, 0, arrayDigits.length);
                        spare[arrayDigits.length] = charNumber[i];
                        arrayDigits = spare;
                    }
                    j++;
                }
            }

             if (minDigits > arrayDigits.length){
                minDigits = arrayDigits.length;
                minNumber = list.get(k);
                minArrayDigits = arrayDigits;
            }
            if (k == list.size() -1)
                System.out.println("number " + minNumber + " have " + minDigits + " a different digits "
                        + Arrays.toString(minArrayDigits));
            k++;
        }

    }

}
