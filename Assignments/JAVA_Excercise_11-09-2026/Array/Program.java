import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        // ==========================================
        // Exercise 2: Sort a Numeric Array
        // ==========================================

        System.out.println("Enter size of array : ");
        int n = ConsoleInput.getInt();

        int arr[] = new int[n];

        // Taking input from the user
        for (int i = 0; i < n; i++) {

            System.out.println("Enter " + i + " Value : ");
            arr[i] = ConsoleInput.getInt();
        }

        // Sorting array using swapping logic
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array : " + Arrays.toString(arr));
        System.out.println("==========");


        // ==========================================
        // Exercise 3: Find Sum of Array Elements
        // ==========================================

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];
        }

        System.out.println("Sum of values of array : " + sum);
        System.out.println("==========");


        // ==========================================
        // Exercise 4: Find Average of Array Elements
        // ==========================================

        double avg = (double) sum / n;

        System.out.println("Average value of array elements : " + avg);
        System.out.println("==========");


        // ==========================================
        // Exercise 5: Copy an Array by Iterating
        // ==========================================

        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr1[i] = arr[i];
        }

        System.out.println("Copied Array : " + Arrays.toString(arr1));
        System.out.println("==========");


        // ==========================================
        // Exercise 6: Find Minimum and Maximum Value
        // ==========================================

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {

                min = arr[i];
            }

            if (arr[i] > max) {

                max = arr[i];
            }
        }

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        System.out.println("==========");


        // ==========================================
        // Exercise 7: Reverse an Array
        // ==========================================

        int temp = 0;

        int itemp = 0;

        int jtemp = arr.length - 1;

        while (itemp < jtemp) {

            temp = arr[itemp];

            arr[itemp] = arr[jtemp];

            arr[jtemp] = temp;

            itemp++;

            jtemp--;
        }

        System.out.println("Reverse of Array : " + Arrays.toString(arr));
        System.out.println("==========");


        // ==========================================
        // Exercise 8: Find Duplicate Values in Array
        // ==========================================

        for (int i = 0; i < n; i++) {

            boolean found = false;

            // Check if element appeared before
            for (int k = 0; k < i; k++) {

                if (arr[i] == arr[k]) {

                    found = true;
                    break;
                }
            }

            // If not printed before, check duplicates ahead
            if (!found) {

                for (int j = i + 1; j < n; j++) {

                    if (arr[i] == arr[j]) {

                        System.out.println("Duplicate : " + arr[i]);
                        break;
                    }
                }
            }
        }

        System.out.println("==========");


        // ==========================================
        // Exercise 9: Find Duplicate Values in Array
        // Same logic as Exercise 8
        // ==========================================

        // Exercise 9 is the same as Exercise 8,
        // so the duplicate logic above can be used.


        // ==========================================
        // Exercise 10: Find Common Elements
        // Between Two Different Arrays
        // ==========================================

        int a2[] = new int[n];

        System.out.println("Enter elements for Second Array");

        for (int i = 0; i < n; i++) {

            System.out.println("Enter " + i + " Value : ");

            a2[i] = ConsoleInput.getInt();
        }

        System.out.println("Second Array : " + Arrays.toString(a2));

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (arr[i] == a2[j]) {

                    System.out.println("Common Element : " + arr[i]);
                    break;
                }
            }
        }
    }
}