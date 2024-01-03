package revision_code;

import java.util.Arrays;

public class missing {
    static class Solve {
    int[] findTwoElement(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int ans[] = new int[2];
        int elem = n;
        int count = 0;

 

        for (int i = 1; i <= elem; i++) {
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                ans[0] = i;
                int k=i;                
                while (k<n) {
                    //delete the repeated element
                    arr[k] = arr[k + 1];
                    k++;
                }
            }
            count = 0; // Reset count for the next iteration
        }
       for (int i = 0; i < elem; i++) {
            if (i + 1 != arr[i]) {
                ans[1] = i + 1;
                break; // Break out of the loop after finding the missing element
            }
        }
        return ans;
    }
}

    public static void main(String[] args) {
      
            int[] arr = {13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45};
            int n = arr.length;
    
            Solve solve = new Solve();
            int[] result = solve.findTwoElement(arr, n);
    
            System.out.println("Missing Element: " + result[0]);
            System.out.println("Repeated Element: " + result[1]);
        }
    }

