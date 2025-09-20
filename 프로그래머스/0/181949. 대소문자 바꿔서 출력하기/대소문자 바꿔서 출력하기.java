import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Scanner 유틸을 호출합니다.
        Scanner sc = new Scanner(System.in);
        // str은 알파벳으로 이루어진 문자열 입력
        String str = sc.next();
        // 문자열 길이만큼의 문자 배열을 선언합니다.
        char[] reverseCharArray = new char[str.length()];
        
        // 문자열의 각 문자를 하나씩 순회하며 확인합니다.
        for (int i = 0; i < str.length(); i++) {
            // 순회 중 확인할 문자는 str 문자열에서 i번째 문자
            char orginalChar = str.charAt(i);
            
            // 만약 문자가 소문자(ifLowerCase)일 경우
            if (Character.isLowerCase(orginalChar)) {
                // 문자 배열의 i번째 문자는 대문자(toUpperCase)로 변경합니다.
                reverseCharArray[i] = Character.toUpperCase(orginalChar);
            }
            // 그 이외의 경우(대문자) 일 경우
            else {
                // 문자 배열의 i번째 문자는 소문자(toLowerCase)로 변경합니다.
                reverseCharArray[i] = Character.toLowerCase(orginalChar);
            }
        }
        
        // 문자 배열 reverseCharArray를 문자열 reverseStr로 변경합니다.
        String reverseStr = new String(reverseCharArray);
        // reverseStr을 출력합니다.
        System.out.print(reverseStr);
    }
}