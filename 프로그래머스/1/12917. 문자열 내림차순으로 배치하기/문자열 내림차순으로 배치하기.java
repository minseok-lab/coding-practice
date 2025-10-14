import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열 s를 문자 배열 sArray로 변환
        char[] sArray = s.toCharArray();
        // 문자 배열을 오름차순으로 변환
        Arrays.sort(sArray);
        // 정답 문자열에 문자 배열을 역순으로 추가
        for (int i = sArray.length - 1; i >= 0; i--) {
            answer += sArray[i];
        }
        return answer;
    }
}