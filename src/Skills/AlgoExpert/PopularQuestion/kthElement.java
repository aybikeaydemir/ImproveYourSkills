package Skills.AlgoExpert.PopularQuestion;

import java.util.Arrays;

public class kthElement {

    public int getKthElement(int [] arr, int kth){
        if (kth>arr.length)
            return -1;
        if (kth == arr.length)
            return arr[0];
        Arrays.sort(arr);
        return arr[arr.length-kth];
    }



}
