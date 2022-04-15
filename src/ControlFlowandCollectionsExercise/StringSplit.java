package ControlFlowandCollectionsExercise;

import java.util.Arrays;


public class StringSplit {

    public static void main(String[] args) {
        String initialStr = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] words = initialStr.split("\\.");
        System.out.println(Arrays.toString(words));

        String[] myWords = initialStr.split(" ");
//        System.out.println(Arrays.toString(myWords));
        StringSplitHelper.strSizeFive(myWords);

    }
}
