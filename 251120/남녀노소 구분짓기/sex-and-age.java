import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        int sex;

        sex = sc.nextInt();
        age = sc.nextInt();

        if (age >= 19) {
            if (sex == 0) {
                System.out.print("MAN");
            } else {
                System.out.print("WOMAN");
            }
        } else {
            if (sex == 0) {
                System.out.print("BOY");
            } else {
                System.out.print("GIRL");
            }
        }
    }
}
