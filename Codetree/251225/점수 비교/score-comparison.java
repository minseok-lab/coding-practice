import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMathScore = sc.nextInt();
        int aEngScore = sc.nextInt();
        int bMathScore = sc.nextInt();
        int bEngScore = sc.nextInt();

        if (aMathScore > bMathScore && aEngScore > bEngScore) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}