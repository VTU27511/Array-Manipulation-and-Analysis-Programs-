import java.util.Scanner; public class AdjustedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int adjustedSum = 0;
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                  adjustedSum += arr[i];
                }
            else{
                   adjustedSum -= arr[i];
               }
        }
        System.out.println(adjustedSum);
        sc.close();
    }
}
