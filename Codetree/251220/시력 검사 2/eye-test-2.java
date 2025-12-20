import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        if (n >= 1) {
            System.out.print("High");
        } else if (n >= 0.5) {
            System.out.print("Middle");
        } else {
            System.out.print("Low");
        }
    }
}