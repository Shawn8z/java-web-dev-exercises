package ControlFlowandCollectionsExercise;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            numList.add(i);
        }
        System.out.println(numList);
        Integer totalSum = ArrayListHelper.listSum(numList);
        System.out.println(totalSum);
    }
}
