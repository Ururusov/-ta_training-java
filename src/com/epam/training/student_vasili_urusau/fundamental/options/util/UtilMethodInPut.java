package com.epam.training.student_vasili_urusau.fundamental.options.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilMethodInPut {

    public static List createArray(){
        Scanner scan = new Scanner(System.in);
        List list = new ArrayList();
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
        return list;
    }

}
