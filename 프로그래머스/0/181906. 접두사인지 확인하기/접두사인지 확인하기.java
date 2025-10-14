class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        // 비교를 위한 임시 문자열 선언
        String compareStr = "";
        // my_string 객체를 순회하며
        for (int i = 0; i < my_string.length(); i++) {
            // my_string의 문자를 하나씩 compareStr 문자열에 추가
            char c = my_string.charAt(i);
            compareStr += c;
            // 만약 compareStr 문자열과 is_prefix 문자열이 동일하다면
            if (compareStr.equals(is_prefix)) {
                // 1을 정답으로 선언하고 반복문 탈출
                answer = 1;
                break;
            }
        }
        return answer;
    }
}