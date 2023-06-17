package ExampleNo5;

import java.util.ArrayList;
import java.util.Arrays;
public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<int[]> permutations = getPermutations(arr, 0, new ArrayList<int[]>());
        for (int[] permutation : permutations) {
            System.out.println(Arrays.toString(permutation));
        }
    }

    public static ArrayList<int[]> getPermutations(int[] arr, int index, ArrayList<int[]> permutations) {
        if (index == arr.length - 1) {
            permutations.add(Arrays.copyOf(arr, arr.length));
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                getPermutations(arr, index + 1, permutations);
                swap(arr, index, i);
            }
        }
        return permutations;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
