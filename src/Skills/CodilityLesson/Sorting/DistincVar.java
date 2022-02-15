package Skills.CodilityLesson.Sorting;

import java.util.*;

public class DistincVar {

    public int solution(int[] A) {

        if (A.length<=0)
            return 0;

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i<A.length ; i++ ){
            hs.add(A[i]);
        }

        return hs.size();
    }

    public static void main (String []args){
        HashSet<String> hs = new HashSet<String>();
        // Adding elements to the HashSet
        hs.add("geeks");
        hs.add("practice");
        hs.add("contribute");
        ;

        System.out.println(
                "Before adding duplicate values \n\n" + hs);

        // Addition of duplicate elements
        hs.add("geeks");
        hs.add("practice");

        System.out.println(
                "\nAfter adding duplicate values \n\n" + hs);

        // Addition of null values
        hs.add(null);
        hs.add(null);

        // Displaying HashSet elements
        System.out.println("\nAfter adding null values \n\n"
                + hs);
    }
}
