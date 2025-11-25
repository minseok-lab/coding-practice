import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 1 || i == str.length() - 2) {
                answer += 'a';
            } else {
                answer += str.charAt(i);
            }
        }

        System.out.print(answer);
    }
}