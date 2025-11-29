import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        while (true) {
            num = sc.nextInt();
            if (num > 25) {
                System.out.println("Lower");
            } else if(num < 25) {
                System.out.println("Higher");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}