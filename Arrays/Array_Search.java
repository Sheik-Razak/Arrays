package Arrays;
//Write a program to search a value in the array and print the index if it is found else print not found
import java.util.Scanner;

public class Array_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        //Input from user for Array values
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to be searched: ");
        int search = sc.nextInt();

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            //Condition for checking whether the element is there are not.
            if(arr[i] == search){
                System.out.println("Element found at index " + i);
            }
            else{
                count++;
            }
        }
        //If the size of array is same then element is not found.
        if(count == arr.length){
            System.out.println("Element not found");
        }

    }
}

