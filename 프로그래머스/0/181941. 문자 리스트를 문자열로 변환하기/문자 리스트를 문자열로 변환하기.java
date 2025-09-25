class Solution {
    public String solution(String[] arr) {
        String answer = "";
        // 0부터 arr 배열의 길이만큼 반복 실행합니다.
        for (int i = 0; i < arr.length; i++) {
            // 정답 문자열에 arr 배열의 i번째 수를 더합니다.
            answer += arr[i];
        }
        return answer;
    }
}