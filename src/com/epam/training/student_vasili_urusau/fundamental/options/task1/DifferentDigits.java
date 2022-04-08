package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DifferentDigits {
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
