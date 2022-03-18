public class CompSci_Test5 {
    public static void main(String[] args) {
        /*
        20 mc and 1fr

        - Sequential / Linear Search
            - Best: 1st index
            - Worst: Not in array
            - Pro: Does not need sorting
            - Con: SLOW

            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    return i;
                }
            }

        - Binary Search
            - Best: Middle index
            - Worst: Not in array
            - Pro: FAST
            - Con: Sorting issue
            - 2^n rule (round up)
            - Divide and Conquer

            int right = array.length-1;
            int left = 0;
            int mid = (right + left) / 2;
            while (right >= left) {
                mid = (right + left) / 2;
                if (array[mid] == num) {
                    return i;
                }
                else if (a[mid] > num) {
                    right = mid-1;
                }
                else if (a[mid] < num) {
                    left = mid+1;
                }
            }

        - Selection Sorting
            - After n passes, n elements are sorted
            - n-1 total swaps
            - Best: None
            - Worst: None
            - Pro: Easy
            - Con: Slow

            int temp;
            int pos;
            for (int i = 0; i < array.length-1; i++) {
                temp = array[i];
                pos = i;
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < temp) {
                        temp = array[j];
                        pos = j;
                    }
                }
                array[pos] = array[i];
                array[i] = temp;
            }

        - Insertion
            - Assume first number is sorted
            - After n passes, n+1 elements are sorted
            - n-1 total swaps
            - Best: Already sorted
            - Worst: Backwards
            - Pro: Easy
            - Con: Slow

            for (int i = 1; i < array.length; i++) {
                int temp = array[i];
                int pos = i - 1;
                while (pos >= 0 && temp < array[pos]) {
                    array[pos + 1] = array[pos];
                    pos--;
                }
                array[pos + 1] = temp;
            }

        - Merge
            - Split into multiple arrays (get into individual arrays and then bring together while sorting)
            - Extra element goes on left
            - Best: None
            - Worst: None
            - Pro: Very Fast
            - Con: Memory
            - Divide and Conquer
            - Recursion
            - Recursive temp arrays
        */
    }
}
