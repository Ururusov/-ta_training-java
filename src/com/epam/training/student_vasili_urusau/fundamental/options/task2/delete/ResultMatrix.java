package com.epam.training.student_vasili_urusau.fundamental.options.task2.delete;

import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMatrix;

public class ResultMatrix {
   private int range ;
   private int [][] matrix ;
   private int numberLine;
   private int numberColum;
   private int [] columMax;
   private int max ;
   private int [][] matrixResult ;

    public ResultMatrix(int range, int[][] matrix, int numberLine,
                        int numberColum, int[] columMax, int max, int[][] matrixResult) {
        this.range = range;
        this.matrix = matrix;
        this.numberLine = numberLine;
        this.numberColum = numberColum;
        this.columMax = columMax;
        this.max = max;
        this.matrixResult = matrixResult;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int[][] getMatrix() {
        int[][] copy = UtilMatrix.copyMatrix(this.matrix);
        return copy;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getNumberLine() {
        return numberLine;
    }

    public void setNumberLine(int numberLine) {
        this.numberLine = numberLine;
    }

    public int getNumberColum() {
        return numberColum;
    }

    public void setNumberColum(int numberColum) {
        this.numberColum = numberColum;
    }

    public int[] getColumMax() {
        return columMax;
    }

    public void setColumMax(int[] columMax) {
        this.columMax = columMax;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int[][] getMatrixResult() {
        return matrixResult;
    }

    public void setMatrixResult(int[][] matrixResult) {
        this.matrixResult = matrixResult;
    }
}
