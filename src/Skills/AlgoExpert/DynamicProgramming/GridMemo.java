package Skills.AlgoExpert.DynamicProgramming;

import java.util.HashMap;

public class GridMemo {

  // recursive : O(2^n+m) time O(n+m) space

    public HashMap<String,Integer> sol = new HashMap<>();
// dynamic programming : O(n*m) time O(n+M) space
    public int getGridMemo(int m , int n){
        var key = m+","+n;
        if(sol.containsKey(key))
            return sol.get(key);
        //base cases
        if (m == 0 || n == 0 )
            return 0;
        if (m == 1 || n == 1 )
            return 1;
        sol.put(key,getGridMemo(m-1,n) + getGridMemo(m,n-1));
        return sol.get(key);
    }

    public static void main (String [] args) {
        GridMemo memo = new GridMemo();
        System.out.println(memo.getGridMemo(18,18));
    }


}
