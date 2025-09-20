import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // i는 0부터 문자열 길이만큼 하나씩 늘어나며 반복합니다.
        for(int i = 0; i < str.length(); i++) {
            // 문자를 한줄씩 나눠서 출력하기 위해 charAt()을 사용합니다.
            // str의 i번째 숫자는 splitText
            char splitText = str.charAt(i);
            // splitText를 줄바꿈하여 출력합니다.
            System.out.println(splitText);
        }
    }
}