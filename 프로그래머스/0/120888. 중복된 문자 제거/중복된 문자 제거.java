class Solution {
    public String solution(String my_string) {
        String answer = "";
        // my_string 문자열을 순회
        for (int i = 0; i < my_string.length(); i++) {
            // c는 문자열의 i번째 글자
            char c = my_string.charAt(i);
            // 정답 배열에 c가 담겨져 있다면
            if (answer.contains(String.valueOf(c))) {
                // 빈칸 추가
                answer += "";
            } else { // 담겨져 있지 않다면 c 추가
                answer += c;
            }
        }
        return answer;
    }
}