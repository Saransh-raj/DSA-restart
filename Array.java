import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        // Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int arr_size = sc.nextInt();

        int[] arr = new int[arr_size];

        System.out.println("Enter array elements");

        // for taking input in array
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        // to print the array 
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
