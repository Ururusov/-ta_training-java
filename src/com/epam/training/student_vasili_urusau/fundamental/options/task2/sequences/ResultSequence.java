package com.epam.training.student_vasili_urusau.fundamental.options.task2.sequences;

import java.util.List;

public class ResultSequence {
    int [][] matrix;
    int range;
    List<Integer> sequence;

    public ResultSequence(int[][] matrix, int range, List<Integer> sequence) {
        this.matrix = matrix;
        this.range = range;
        this.sequence = sequence;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public List<Integer> getSequence() {
        return sequence;
    }

    public void setSequence(List<Integer> sequence) {
        this.sequence = sequence;
    }
}
