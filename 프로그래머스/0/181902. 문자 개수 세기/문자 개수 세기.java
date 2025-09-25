class Solution {
    public int[] solution(String my_string) {
        // 정답 배열의 길이는 52개
        int[] answer = new int[52];
        
        // 문자열의 길이만큼 하나씩 늘어나며 반복
        for(int i = 0; i < my_string.length(); i++) {
            // 알파벳 배열에 추가할 숫자의 위치를 탐색
            char alphabet = my_string.charAt(i);
            // 대문자면
            if (Character.isUpperCase(alphabet)) {
                // 알파벳에서 아스키 코드'A' 빼기
                int arrayNum = alphabet - 'A';
                // 정답의 arrayNum 의 위치에 1추가
                answer[arrayNum] += 1;
            } else {
                // 소문자면 알파벳에서 아스키 코드 'a'를 빼고 26 추가
                int arrayNum = alphabet - 'a' + 26;
                // 정답의 arrayNum 의 위치에 1추가
                answer[arrayNum] += 1;
            }
        }
        return answer;
    }
}