class Solution {
    public int solution(String s) {
        int answer = 0;
        // 문자열 s를 공백으로 분리한 문자열 배열 str
        String[] str = s.split(" ");
        
        // 문자열 배열 길이만큼 순회
        for (int i = 0; i < str.length; i++) {
            // 문자열의 i번째 값이 문자 Z와 같다면
            if (str[i].equals("Z")) {
                // 정답에서 배열의 (i-1) 값을 정수형으로 변환 후 뺌
                answer -= Integer.parseInt(str[i - 1]);
            } else { // 그 외의 값은
                // 정답에 배열의 (i) 값을 정수형으로 변환 후 더함
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}