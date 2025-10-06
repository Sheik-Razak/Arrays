package Arrays;

import java.util.Scanner;

public class Array_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting Array");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        //Logic for Sorting Array
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    //Swapping
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Printing the array
        System.out.println("\nAfter sorting elements :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

