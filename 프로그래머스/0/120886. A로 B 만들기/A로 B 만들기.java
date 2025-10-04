class Solution {
    public int solution(String before, String after) {

        // 정답 1로 초기화
        int answer = 1;
        // 알파벳 배열 선언
        int[] alphabet = new int[26];
        
        // 상향된 for문 사용해서 before과 after를 각각 알파벳 배열에 추가하고 뺌
        for (char c : before.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (char c : after.toCharArray()) {
            alphabet[c - 'a']--;
        }
        // 배열을 순회하면서 0이 아닌 경우가 발생할 경우, 정답을 0으로 설정하고, 반복문 탈출
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}