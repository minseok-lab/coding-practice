import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            System.out.print((num * num) + " ");
        }
    }
}