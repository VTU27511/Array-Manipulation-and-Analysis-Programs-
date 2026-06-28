import java.util.Scanner;

public class Right {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter the elements one by one:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter k value:");
        int k = sc.nextInt();
        k = k % n;


        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }


        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
        System.out.println();


        int maxDiff = 0;
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(rotated[i] - rotated[i + 1]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }


        int lastDiff = Math.abs(rotated[n - 1] - rotated[0]);
        if (lastDiff > maxDiff) {
            maxDiff = lastDiff;
        }


        System.out.println("Maximum absolute difference = " + maxDiff);

        sc.close();
    }
}


