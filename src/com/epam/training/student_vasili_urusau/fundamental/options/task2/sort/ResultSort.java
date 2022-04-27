package com.epam.training.student_vasili_urusau.fundamental.options.task2.sort;


import com.epam.training.student_vasili_urusau.fundamental.options.util.UtilMatrix;

public class ResultSort {

    int[][] matrix;
    int[][] matrixSort;

    public ResultSort(int[][] matrix) {
        int[][] copy = UtilMatrix.copyMatrix(matrix);
        this.matrix = copy;
    }

    public int[][] getMatrix() {
        int[][] copy = UtilMatrix.copyMatrix(this.matrix);
        return copy;
    }

    public void setMatrix(int[][] matrix) {
        int[][] copy = UtilMatrix.copyMatrix(matrix);
        this.matrix = copy;
    }

    public int[][] getMatrixSort() {
        int[][] copy = UtilMatrix.copyMatrix(this.matrixSort);
        return copy;
    }

    public void setMatrixSort(int[][] matrixSort) {
        int[][] copy = UtilMatrix.copyMatrix(matrixSort);
        this.matrixSort = copy;
    }

}
