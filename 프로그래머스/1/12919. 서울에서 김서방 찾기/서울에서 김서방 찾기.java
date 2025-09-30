class Solution {
    public String solution(String[] seoul) {
        // 정답 문자열을 "김서방은 "으로 선언
        String answer = "김서방은 ";
        
        // 서울 배열을 순회
        for (int i = 0; i < seoul.length; i++) {
            // 만약 서울의 i번째 문자열이 Kim이면
            if (seoul[i].equals("Kim")) {
                // 문자열에 i를 더하고, "에 있다" 추가
                answer += i + "에 있다";
            }
        }
        return answer;
    }
}