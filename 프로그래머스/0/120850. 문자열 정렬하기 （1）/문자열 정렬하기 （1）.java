// 배열 유틸을 import 합니다.
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        // 배열 길이 확인을 위해 count 변수 선언
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if ('0' <= c && c <= '9') {
                count++;
            }
        }
        
        // answer 배열과 배열 내 번호 index 변수 선언
        int[] answer = new int[count];
        int index = 0;
        // my_string을 순회하며 0부터 9까지 범위의 아스키 코드를 갖는지 검토
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if ('0' <= c && c <= '9') {
                answer[index] = c - 48; // 아스키 코드를 숫자로 변환하기 위해 -48
                index++; // 배열에 값을 넣으면 index 값 증가
            }
        }
        
        // answer배열 오름차순
        Arrays.sort(answer);
        return answer;
    }
}