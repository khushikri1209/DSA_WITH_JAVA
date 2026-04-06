import java.util.ArrayList;
import java.util.Arrays;

public class J01AlternatesElement {
    // Approach 1- Iterate every element
    public static ArrayList<Integer> usingIterative(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    // Approach 2- Jumping index

    public static ArrayList<Integer> usingJumpingIndex(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i = i + 2) {
            result.add(arr[i]);
        }

        return result;
    }

    //Approach 3- Recursive approach 
    public static ArrayList<Integer> usingRecursion(ArrayList<Integer> list, int[] arr, int i){
        
        if(i>=arr.length){
            return list;
        }
        list.add(arr[i]);
        usingRecursion(list, arr,i+2);
        return list;
    }

    public static void main(String args[]) {
        // Approach 1
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        ArrayList<Integer> list = new ArrayList<>();
        list = usingIterative(arr1);
        System.out.println("First array:"+ list.toString());

        // Approach 2
        int[] arr2 = {10, 20, 30, 40, 50};
        list = usingJumpingIndex(arr2);
        System.out.println("Second array:"+ list.toString());

        //Approach 3
        int[] arr3 = {10, 20, 30, 40, 50};
        list = usingRecursion(list, arr3, 0);
        System.out.println("Third array: "+list.toString());
    }
}
