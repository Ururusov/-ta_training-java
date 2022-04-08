package com.epam.training.student_vasili_urusau;

import java.util.ArrayList;
import java.util.List;

public class MinDifferentDigitsResult {

        private int minNumber;
        private List<Character> minDifferentDigits;

        public MinDifferentDigitsResult(int minNumber, List<Character> minDifferentDigits) {
            this.minNumber = minNumber;
            this.minDifferentDigits = minDifferentDigits;
        }

        public int getMinNumber() {
            return minNumber;
        }

        public List<Character> getMinDifferentDigits() {
            List<Character> copy = new ArrayList<>(minDifferentDigits);
            return copy;
        }

        public int getQuantity(){
            return minDifferentDigits.size();
        }

}
