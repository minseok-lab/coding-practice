import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int minNum = 110;

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }

        if (minNum == arr[0]) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

        System.out.print(" ");

        if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[0]) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}