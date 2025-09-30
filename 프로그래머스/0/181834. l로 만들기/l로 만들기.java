class Solution {
    public String solution(String myString) {
        String answer = "";
        
        // 문자열의 길이를 순회하며 반복합니다.
        for (int i = 0; i < myString.length(); i++) {
            // 문자 c는 myString의 i번째 문자입니다.
            char c = myString.charAt(i);
            // 만약 아스키코드 'l'보다 작을 경우
            if (c < 'l') {
                answer += 'l'; // 정답 문자열에 'l' 추가
            } else { // 그 이외의 경우 (l 보다 클 경우)
                answer += c; // c 문자 그대로 문자열에 추가합니다.
            }
        }
        return answer;
    }
}