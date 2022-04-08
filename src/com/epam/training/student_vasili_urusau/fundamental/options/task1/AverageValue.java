package com.epam.training.student_vasili_urusau.fundamental.options.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        ArrayList arrayList = createArray();
        average(arrayList);
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

    public static void average(ArrayList<Integer> arrayList){
        int averageLength;
        int sum = 0 ;
        for (int i = 0; i < arrayList.size(); i++)
            sum += Integer.toString(Math.abs(arrayList.get(i))).length();
        averageLength = sum / arrayList.size();
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
