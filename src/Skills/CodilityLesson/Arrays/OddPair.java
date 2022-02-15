package Skills.CodilityLesson.Arrays;

public class OddPair {
    public int solution(int[] A) {
        // write your code in Java SE 8

        // Using the concept of "XOR" (^)
        // when there is a pair A and B
        // A^B will be zero
        // A^B^C (where C is not paired),
        // then A^B^C = C

        // special case
        if(A.length == 0)
            return 0;

        int unpaired;
        unpaired = A[0]; // initial

        for(int i=1; i< A.length; i++){
            unpaired = unpaired ^ A[i]; // xor
        }

        return unpaired; // return the unpaired value
    }

    public static void main(String args[]){
        OddPair oddPair = new OddPair();
        int A [] = new int[7];
        A[0] = 9 ;
        A[1] = 3 ;
        A[2] = 9;
        A[3] = 3 ;
        A[4] = 9 ;
        A[5] = 7;
        A[6] = 9;
        oddPair.solution(A);
    }
}
