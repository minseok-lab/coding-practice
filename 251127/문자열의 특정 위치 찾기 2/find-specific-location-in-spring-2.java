import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        String[] fruit = {"apple", "banana", "grape", "blueberry", "orange"};

        for (int i = 0; i < fruit.length; i++) {
            for (int j = 2; j <= 3; j++) {
                if (fruit[i].charAt(j) == str.charAt(0)) {
                    System.out.println(fruit[i]);
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}