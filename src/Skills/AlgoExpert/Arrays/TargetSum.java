package Skills.AlgoExpert.Arrays;
import java.util.*;
public class TargetSum {

    public static int [] targetSum(int [] array,int target){

        Arrays.sort(array);
        int right = array.length-1;
        int left = 0;

        while (left<right)
        {
            int currentSum = array[left] + array[right];
            if (currentSum<target){
                left++;
            } else if (target<currentSum) {
                right --;
            } else {
                return new int [] {array[left] , array [right]};
            }
        }
        return new int[0];
    }

    public static void main (String [] args){



    }
}
