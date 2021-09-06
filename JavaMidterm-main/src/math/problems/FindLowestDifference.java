package math.problems;

public class FindLowestDifference {

    public static int[] main(String[] args) {
        /*
         Write a method to return the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int[] pair = FindLowestDifference(array1, array2);
        System.out.println(pair[0] + " " + pair[1]);
        double FindLowestDifference = Double.MAX_VALUE;
        int[] smallestDiffPair = new int[2];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                int currentDiff = Math.abs(array1[i] - array2[j]);
                if (currentDiff < smallestDiff) {
                    smallestDiff = currentDiff;
                    smallestDiffPair[0] = array1[i];
                    smallestDiffPair[1] = array2[j];
                }
            }
        }
        return smallestDiffPair;
    }
}



