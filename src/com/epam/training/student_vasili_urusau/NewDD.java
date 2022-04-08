package com.epam.training.student_vasili_urusau;

import com.epam.training.student_vasili_urusau.fundamental.options.task1.MinDifferentDigits;

import java.util.*;

public class NewDD {
    public static void main(String[] args) {
        ArrayList arrayList = createArray();
        Optional<MinDifferentDigitsResult> resultOptional = differentDigits(arrayList);

        if (resultOptional.isPresent()) {
            MinDifferentDigitsResult result = resultOptional.get();
            System.out.println("number " + result.getMinNumber() + " have " + result.getQuantity() + " a different digits "
                    + result.getMinDifferentDigits());
        }else {
            System.out.println("sorry, you...");
        }
    }

    public static ArrayList createArray(){
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.println("Accept numbers, for ending accept 'ok'");
        while (scan.hasNext()){
            if(scan.hasNextInt()){
                list.add(scan.nextInt());
            }else {
                String str = scan.nextLine();
                if (str.equals("")) {
                    System.out.println("array accepted");
                    break;
                }
            }
        }
        scan.close();
        return list;
    }

    public static Optional<MinDifferentDigitsResult> differentDigits(ArrayList<Integer> list){
        if(list == null || list.isEmpty()){
            return Optional.empty();
        }

        MinDifferentDigitsResult result = null;
        for(Integer number: list){
            String strNumber;
            strNumber = Integer.toString(Math.abs(number));
            char charNumber[] = strNumber.toCharArray();

            List digitsList = conteDigits(charNumber);

            if (result == null || result.getQuantity() > digitsList.size()){
                result = new MinDifferentDigitsResult(number, digitsList);
            }
        }

        return Optional.of(result);
    }

    public static List<Character> conteDigits(char[] chars){
        List<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (!arrayList.contains(chars[i]))
                arrayList.add(chars[i]);
        }
        return arrayList;
    }

}

