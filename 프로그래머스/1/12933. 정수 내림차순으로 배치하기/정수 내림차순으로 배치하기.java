import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 임시 정답 문자열을 선언
        String answerStr = "";
        // n을 문자열로 변환합니다.
        String nStr = String.valueOf(n);
        // 변환한 문자열을 문자 배열로 변환합니다.
        char[] cArray = nStr.toCharArray();
        // cArray를 오름차순으로 정렬합니다.
        Arrays.sort(cArray);
        // 정렬된 문자 배열의 맨 뒤의 값부터 첫번째 값으로 하나씩 순회하며 정답 문자열에 추가합니다.
        for (int i = cArray.length - 1; 0 <= i; i--) {
            answerStr += cArray[i];
        }
        // 정답 문자열을 long 변수값으로 변환합니다.
        long answer = Long.parseLong(answerStr);
        
        return answer;
    }
}