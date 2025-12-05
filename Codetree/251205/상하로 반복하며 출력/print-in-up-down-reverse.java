import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = cnt;
                    cnt++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = cnt;
                    cnt++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}