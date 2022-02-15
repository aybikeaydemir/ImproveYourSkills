package Skills.AlgoExpert.DynamicProgramming;

import java.util.HashMap;

public class FibMemo {
    public HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

    /*
      O(n) time
      O(n) space
     */

    public int getFibonacciNumberTopDown(int n ) {
        if( hm.containsKey(n)) return hm.get(n);
        if(n == 0) return 0;
        if(n == 1) return 1;
        hm.put(n, getFibonacciNumberTopDown(n - 1) + getFibonacciNumberTopDown(n - 2));
        return hm.get(n);
    }

    public static void main (String [] args) {
        FibMemo memo = new FibMemo();
        System.out.println(memo.getFibonacciNumberTopDown(40));
    }

}
