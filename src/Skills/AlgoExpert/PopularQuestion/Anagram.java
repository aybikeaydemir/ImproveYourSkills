package Skills.AlgoExpert.PopularQuestion;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String word1,String word2){
        return sortString(word1).equals(sortString(word2));
    }
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    public static void main(String [] args ){
        System.out.println(isAnagram("danger","danger"));
    }

}
