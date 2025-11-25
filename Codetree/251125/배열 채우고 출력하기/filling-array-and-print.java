import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[10];
        String answer = "";

        for (int i = 0; i < 10; i++) {
            str[i] = sc.next();
        }

        for (int i = 9; i >= 0; i--) {
            answer += str[i];
        }
        System.out.print(answer);
    }
}
