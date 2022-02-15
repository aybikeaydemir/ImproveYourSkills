package Skills.CodilityLesson.Counting;

import java.util.*;

public class Permutation {

    public int solution(int[] A) {

        HashSet <Integer> per = new HashSet<>();
        for (int i = 0 ; i<A.length; i++) {
            per.add(A[i]);
        }
        for (int i = 0 ; i<A.length ; i++)
            if (!per.contains(i)){
                return 0;
            }

        return 1 ;
    }

}
