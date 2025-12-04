import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = sc.nextInt();
                if (num % 5 == 0) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}