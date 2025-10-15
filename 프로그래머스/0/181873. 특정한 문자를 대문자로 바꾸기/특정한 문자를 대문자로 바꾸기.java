class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        // my_string 문자열을 순회하며
        for (int i = 0; i < my_string.length(); i++) {
            // 만약 my_string의 i번째 문자가 alp와 동일하다면
            if (String.valueOf(my_string.charAt(i)).equals(alp)) {
                // 만약 my_string의 i번째 문자를 대문자로 선언
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            } else {
                // 그 외에는 그냥 추가
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}