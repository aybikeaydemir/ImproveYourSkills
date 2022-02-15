package Skills.CodilityLesson.Stack;

import java.util.Stack;

public class Fish {

    public int getSolution (int A [] , int B[]){

        Stack<Integer> fishes = new Stack<>();
        int numFish= A.length;

        for(int i = 0 ; i<A.length; i++){
            //down
            if (B[i] == 1 ) {
                fishes.push(A[i]);
            }
            //up
            else {
                while (!fishes.isEmpty()){
                    //upside bigger than downside fish
                    if (fishes.peek()<A[i]) {
                        numFish--;
                        fishes.pop();
                    }
                   // downside fish bigger than upside
                    if (fishes.peek()>A[i]){
                        numFish--;
                        break;
                    }

                }
            }
        }

        return  numFish;
    }


    public static void main(String[] args) {

    }
}
