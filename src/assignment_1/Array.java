package assignment_1;
import java.util.*;

// ArrayFunctions (Questions 1–4)
// ==================================================
public class Array{

    // Q1: Clone an array
    static int[] cloneArray(int[] arr) {

        return arr.clone();
    }

    // Q2: Remove random element from array
    static int[] removeRandom(int[] arr) {
        Random r = new Random();
        int index = r.nextInt(arr.length);
        int[] res = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++)
            if (i != index) res[j++] = arr[i];
        return res;
    }

    // Q3: Remove specific element from array
    static int[] removeSpecific(int[] arr, int key) {
        return Arrays.stream(arr).filter(x -> x != key).toArray();
    }


    // Q4: Reverse an array
    static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
        }
    }
}

