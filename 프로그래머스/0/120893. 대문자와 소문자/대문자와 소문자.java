class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // my_string 문자열을 순회
        for (int i = 0; i < my_string.length(); i++) {
            // 만약 my_string의 i번째 글자가 a부터 z(소문자)면
            if ('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z') {
                // 소문자 a를 빼고 A를 더한 뒤, char로 명시적 형변환
                answer += (char)(my_string.charAt(i) - 'a' + 'A');
            } else { // 대문자면
                // 대문자 A를 빼고 a를 더한 뒤, char로 명시적 형변환
                answer += (char)(my_string.charAt(i) - 'A' + 'a');
            }
        }
        return answer;
    }
}