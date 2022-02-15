package Skills.AlgoExpert.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BestSum {

    /*
     brute force : O(n^m * m ) time
                 : O(m^2) space
     dynamic     : O(n * m^2) time
                 : O(m^2) space
     */
    public static List<Integer> bestSum(int targetSum, List<Integer> numbers){
        HashMap<Integer,List<Integer>> memo =new HashMap<>();
        return bestSum(targetSum,numbers,memo);
    }

    public static List<Integer> bestSum (int targetSum, List<Integer> numbers, HashMap<Integer,List<Integer>> memo){
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0 ) return new ArrayList<>();
        if (targetSum < 0 ) return null;

        List<Integer> shortestCombination = null;

        for (Integer num : numbers) {
            int remainder = targetSum - num;
            List<Integer> remainderCombination = bestSum(remainder, numbers, memo);
            if (remainderCombination != null) {
                List<Integer> combination = new ArrayList<>(remainderCombination);
                combination.add(num);
                if (shortestCombination == null || shortestCombination.size() > combination.size()) {
                    shortestCombination = combination;
                }
            }
        }
        memo.put(targetSum, shortestCombination);
        return shortestCombination;
    }


    public static void main(String []args) {
        System.out.println(bestSum(7,new ArrayList<>( Arrays.asList(3, 2))));
        System.out.println(bestSum(7,new ArrayList<>( Arrays.asList(5, 3,4,7))));
        System.out.println( bestSum(7,new ArrayList<>( Arrays.asList(2,4))));
        System.out.println(bestSum(8,new ArrayList<>( Arrays.asList(2,5, 5))));
        System.out.println(bestSum(100,new ArrayList<>( Arrays.asList(1,25,2,5,14))));


    }
}
