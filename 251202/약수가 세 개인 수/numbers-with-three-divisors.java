import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int answer = 0;

        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer++;
            }
        }
        System.out.print(answer);
    }
}