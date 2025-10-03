import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 소문자로 만들 my_string을 임시로 담을 c 배열을 선언합니다.
        char[] c = new char[my_string.length()];
        // my_string을 소문자로 바꿉니다.
        String lowerStr = my_string.toLowerCase();
        
        // lowerStr 문자열을 c 단어 배열로 추가합니다.
        for (int i = 0; i < lowerStr.length(); i++) {
            c[i] = lowerStr.charAt(i);
        }
        // c 배열을 오름차순 정렬합니다.
        Arrays.sort(c);
        
        // 정답 문자열에 정렬된 c 배열의 값을 추가합니다.
        for (int i = 0; i < c.length; i++) {
            answer += c[i] + "";
        }
        
        return answer;
    }
}