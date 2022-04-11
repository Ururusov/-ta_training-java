package com.epam.training.student_vasili_urusau.fundamental.options.task2;

import com.epam.training.student_vasili_urusau.fundamental.options.UtilMethodInPut;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        int[][] matrix = UtilMethodInPut.createMatrix();
        UtilMethodInPut.matrixToString(matrix);
        System.out.println(sequenceUp(matrix));
        System.out.println(sequenceDown(matrix));
    }

    public static List<Integer> sequenceUp(int[][] matrix){
        List maxSequence = new ArrayList<Integer>();
        List sequence = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            sequence.clear();
            for (int j = 0; j < matrix[0].length - 1 ; j++) {
                if (matrix[i][j] < matrix[i][j + 1]){
                    if (sequence.size() == 0){
                        sequence.add(matrix[i][j]);
                        sequence.add(matrix[i][j + 1]);
                    }else {
                        sequence.add(matrix[i][j + 1]);
                    }
                } else if (sequence.size() > maxSequence.size()){
                    maxSequence.clear();
                    maxSequence.addAll(0, sequence);
                    sequence.clear();
                }else {
                    sequence.clear();
                }
            }
        }
        return maxSequence;
    }

    public static List<Integer> sequenceDown(int[][] matrix){
        List maxSequence = new ArrayList<Integer>();
        List sequence = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            sequence.clear();
            for (int j = 0; j < matrix[0].length - 1 ; j++) {
                if (matrix[i][j] > matrix[i][j + 1]){
                    if (sequence.size() == 0){
                        sequence.add(matrix[i][j]);
                        sequence.add(matrix[i][j + 1]);
                    }else {
                        sequence.add(matrix[i][j + 1]);
                    }
                } else if (sequence.size() > maxSequence.size()){
                    maxSequence.clear();
                    maxSequence.addAll(0, sequence);
                    sequence.clear();

                }else {
                    sequence.clear();
                }
            }
        }
        return maxSequence;
    }

}
