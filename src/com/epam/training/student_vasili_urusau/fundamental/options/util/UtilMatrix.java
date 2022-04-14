package com.epam.training.student_vasili_urusau.fundamental.options.util;

import java.util.Arrays;
import java.util.Objects;

public class UtilMatrix {
    private Integer m;
    private int[][] matrix;
    private Integer maxValue;
    private int numberLineMaxValue;
    private int numberColumMaxValue;
    private int[] lineWhereMaxValue;
    private int[] columWhereMaxValue;


    public UtilMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public UtilMatrix(Integer m, int[][] matrix) {
        this.m = m;
        this.matrix = matrix;
    }

    public UtilMatrix(int[][] matrix, int maxValue, int numberLineMaxValue,
                      int numberColumMaxValue, int[] lineWhereMaxValue, int[] columWhereMaxValue) {
        m = maxValue;
        this.matrix = matrix;
        this.maxValue = maxValue;
        this.numberLineMaxValue = numberLineMaxValue;
        this.numberColumMaxValue = numberColumMaxValue;
        this.lineWhereMaxValue = lineWhereMaxValue;
        this.columWhereMaxValue = columWhereMaxValue;
    }

    public Integer getM() {
        return m;
    }

    public int[][] getMatrix() {
        int[][] copy = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = new int[matrix[i].length];
            System.arraycopy(matrix[i], 0 , copy[i], 0, matrix[i].length);
        }
        return copy;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getNumberLineMaxValue() {
        return numberLineMaxValue;
    }

    public int getNumberColumMaxValue() {
        return numberColumMaxValue;
    }

    public int[] getLineWhereMaxValue() {
        int[] LineWhereMaxValue = this.lineWhereMaxValue;
        return LineWhereMaxValue;
    }

    public int[] getColumWhereMaxValue() {
        int[] ColumWhereMaxValue = this.columWhereMaxValue;
        return ColumWhereMaxValue;
    }

    public void matrixToString() {
        int format = m.toString().length() + 1;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%"+ format +"d|", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public void columToString(){
        int format = maxValue.toString().length() + 1;
        for (int j = 0; j < columWhereMaxValue.length; j++) {
            System.out.printf("|%"+ format +"d|\n", columWhereMaxValue[j]);
        }
    }
}
