package ControlFlowandCollectionsExercise;

import java.util.ArrayList;

public class ArrayListHelper {
    public static int listSum(ArrayList<Integer> List) {
        int sum = 0;
        for (int num : List) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
