class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // my_string을 순회하며 반복합니다.
        for (int i = 0; i < my_string.length(); i++) {
            // my_string의 i번째 문자 c
            char c = my_string.charAt(i);
            
            // c가 a, e, i, o, u중 하나일 경우
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                // 공백 반환
                answer += "";
            } else { // 그 이외의 경우, answer에 추가
                answer += c;
            }
        }
        
        return answer;
    }
}