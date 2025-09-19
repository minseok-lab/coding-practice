class Solution {
    public int[] solution(String[] strlist) {
        // strlist와 동일한 크기의 정답 배열을 선언합니다
        int[] answer = new int[strlist.length];
        
        // i는 0부터 배열 길이만큼 하나씩 늘어나며 순회합니다.
        for (int i = 0; i < strlist.length; i++) {
            // strlist의 i번째 문자의 길이는, answer 배열의 i번째 숫자열입니다.
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}