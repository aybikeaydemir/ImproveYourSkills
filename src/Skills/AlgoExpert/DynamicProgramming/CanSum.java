package Skills.AlgoExpert.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CanSum {

// recursion O(n^m) O(m)
    // dynamic (m*n) O(m)
    public static boolean canSum(int target, List<Integer> numbers){
        HashMap<Integer,Boolean> memo = new HashMap<>();
        return canSum(target, numbers, memo);
    }

    private static boolean canSum(int target, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
        //recursion
        if(memo.containsKey(target)) return memo.get(target);
        if(target==0) return true;
        if (target<0) return false;
        for (int number : numbers) {
            int reminder = target-number;
            if(canSum(reminder,numbers,memo)){
                memo.put(target,true);
                return true;
            }
        }
        memo.put(target,false);
        return false;
    }

    public static void main(String []args) {
        System.out.println(canSum(7,new ArrayList<>( Arrays.asList(3, 2))));
        System.out.println(canSum(7,new ArrayList<>( Arrays.asList(5, 3,4,7))));
        System.out.println( canSum(7,new ArrayList<>( Arrays.asList(2,4))));
        System.out.println(canSum(8,new ArrayList<>( Arrays.asList(2,5, 5))));
        System.out.println(canSum(300,new ArrayList<>( Arrays.asList(7,14))));


    }

}
