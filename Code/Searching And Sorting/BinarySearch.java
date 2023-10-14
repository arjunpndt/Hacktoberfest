import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return its index
            }

            if (arr[mid] < target) {
                left = mid + 1; // Adjust the left boundary
            } else {
                right = mid - 1; // Adjust the right boundary
            }
        }

        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] sortedArray = new int[n];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            sortedArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the target value to search for: ");
        int target = scanner.nextInt();

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
