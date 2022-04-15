package ControlFlowandCollectionsExercise;

public class Array {

    public static void main(String[] args) {
       Integer[] numList =  {1, 1, 2, 3, 5, 8};

       for (Integer num : numList) {
           if (num % 2 != 0) {
               System.out.println(num);
           }
       }
    }
}
