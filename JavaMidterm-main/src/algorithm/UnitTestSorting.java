package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        // Create instance of Sort class
        Sort sort = new Sort();

        // Pass the unsorted array to selectionSort() method from Sort class
        sort.selectionSort(unSortedArray);

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }

        // Implement Unit test for rest of the sorting algorithms below


        // Pass the unsorted array to insertionSort() method from Sort class
        sort.insertionSort(unSortedArray);

        // Verify if the unsorted array is sorted by the insertionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }


        // Pass the unsorted array to mergeSort() method from Sort class
        sort.mergeSort(unSortedArray,0,unSortedArray.length-1);

        // Verify if the unsorted array is sorted by the mergeSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }



        // Pass the unsorted array to bubbleSort() method from Sort class
        sort.bubbleSort(unSortedArray);

        // Verify if the unsorted array is sorted by the bubbleSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }



        // Pass the unsorted array to shellSort() method from Sort class
        sort.shellSort(unSortedArray);

        // Verify if the unsorted array is sorted by the shellSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }


        // Pass the unsorted array to heapSort() method from Sort class
        sort.heapSort(unSortedArray);

        // Verify if the unsorted array is sorted by the heapSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }


        // Pass the unsorted array to quickSort() method from Sort class
        sort.quickSort(unSortedArray,0, unSortedArray.length-1);

        // Verify if the unsorted array is sorted by the quickSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }



        // Pass the unsorted array to bucketSort() method from Sort class
        sort.bucketSort(unSortedArray);

        // Verify if the unsorted array is sorted by the bucketSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }


    }
}
