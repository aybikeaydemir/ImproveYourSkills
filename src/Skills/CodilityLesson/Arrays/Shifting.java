package Skills.CodilityLesson.Arrays;


public class Shifting {

    public int[] solution(int[] A, int K) {


        int sol [] = new int[A.length];
        for (int i = 0 ; i<A.length ; i ++) {
            int newPos = (i + K) % A.length;
            sol[newPos] = A[i];
        }


        return sol;
    }
}
