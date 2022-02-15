package Skills.AlgoExpert.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HowSum  {
/*
       m = target sum
       n = numbers.length

        BruteForce
            time : O(n^m * m)
            space : O(m)
        Memoized
            time O(n*m^2)
            space O(m^2)

 */
    public static List<Integer> howSum(int targetSum, List<Integer> numbers){

        HashMap<Integer,List<Integer>> memo =new HashMap<>();
        return howSum(targetSum,numbers,memo);

    }

    private static List<Integer>  howSum(int targetSum, List<Integer> numbers, HashMap<Integer, List<Integer>> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if(targetSum < 0 ) return null;
        if(targetSum == 0 ) return new ArrayList<>();

        for (int number : numbers){
            int reminder =  targetSum - number;
            List<Integer> reminderResult = howSum(reminder,numbers,memo);
            if (reminderResult!= null){
                reminderResult.add(number);
                memo.put(targetSum,reminderResult);
                return reminderResult;
            }
        }
        memo.put(targetSum,null);
        return null;
    }

    public static void main(String []args) {
        System.out.println(howSum(7,new ArrayList<>( Arrays.asList(3, 2))));
        System.out.println(howSum(7,new ArrayList<>( Arrays.asList(5, 3,4,7))));
        System.out.println( howSum(7,new ArrayList<>( Arrays.asList(2,4))));
        System.out.println(howSum(8,new ArrayList<>( Arrays.asList(2,5, 5))));
        System.out.println(howSum(300,new ArrayList<>( Arrays.asList(7,14))));


    }
}
