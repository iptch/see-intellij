package ch.ipt.see.git;

import java.util.Arrays;

public class QuickSort {

    // *----------------------------------------------------------------*
    // | All exercises have to be done without the use of the git cli!  |
    // | Do not push any of your results to origin master               |
    // *----------------------------------------------------------------*

    // 1. Add a piece of code and commit the results into your local master. Use the IntelliJ Commit UI for this task.
    // 2. Create two git branches from your local master. Modify the same lines of code on both branches. Merge your branches into your local master branch and use the merge dialog from intelliJ to resolve the conflict.
    // 3. Change some lines of Code without committing them. Stash those changes and explore the git stash menu.
    // 4. Reset your local master to the tag "git-1"
    // 5. Optional: Create a new branch from your local master. Make some commits. Rebase the commits on the master branch.


    public static void main(String[] args) {

        int[] numberArray =  new int[]{1, 43, 5, 7, 2};
        System.out.println("Initial list of numbers: ");
        printArray(numberArray);
        System.out.println("Sorting numbers...");
        quickSort(numberArray, 0, numberArray.length-1);
        System.out.println("Result: ");

        printArray(numberArray);
    }

    public static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

}
