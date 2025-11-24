import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;
        int temp = 0;

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int i = 0; i < 8; i++) {
            temp = a + b;
            a = b;
            b = temp % 10;
            System.out.print (b + " ");
        }
    }
}