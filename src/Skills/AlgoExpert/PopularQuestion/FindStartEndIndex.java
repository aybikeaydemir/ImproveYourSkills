package Skills.AlgoExpert.PopularQuestion;

import java.util.Arrays;

public class FindStartEndIndex {


    public  int [] findStartEndIndex(int [] numbers,int target){

        int startIndex = findStartIndex(numbers,target);
        return new int [] {startIndex, findEndIndex(numbers,target,startIndex)};
    }

    private  int findStartIndex(int[] numbers, int target) {
        int left = 0 ;
        int right = numbers.length-1;
        int mid ;
        if (numbers[0] == target)
            return 0;
        while (left<=right) {
            mid =( left + right ) / 2 ;
            if (numbers[mid] == target && numbers[mid-1] <target)
                return mid;
            else if (numbers[mid]<target){
                left = mid +1;
            } else
            {
                right = mid -1;
            }
        }

        return -1;
    }

    private static int findEndIndex(int[] numbers, int target,int startIndex) {
        if (startIndex == -1)
            return -1;
        int endIndex =startIndex ;
        for (int i = startIndex+1 ; i<numbers.length ; i++)
            if(numbers[i] == target)
                endIndex += 1;
        return endIndex;
    }

    public static void main (String [] args) {
        FindStartEndIndex startEndIndex = new FindStartEndIndex();
        System.out.println(Arrays.toString(startEndIndex.findStartEndIndex(new int[]{1, 2, 3}, 7)));
        System.out.println(Arrays.toString(startEndIndex.findStartEndIndex(new int[]{1, 4, 5,5,5,5,5}, 5)));
        System.out.println(Arrays.toString(startEndIndex.findStartEndIndex(new int[]{1, 4, 5,5,5,5,5,7,7,7}, 5)));
        System.out.println(Arrays.toString(startEndIndex.findStartEndIndex(new int[]{1, 1,1,2, 3}, 1)));



    }
}
