class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 문자열 순환 반복
        for (int i = 0; i < my_string.length(); i++) {
            // my_string의 i번째 문자 탐색
            char c = my_string.charAt(i);
            // 만약 아스키코드 0부터 9까지의 조건을 모두 만족할 경우
            if ('0' <= c && c <= '9') {
                answer += (c - 48);
            }
        }
        return answer;
    }
}