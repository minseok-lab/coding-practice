class Solution {
    public int solution(int[] array) {
        // 정답 answer 선언
        int answer = 0;
        
        // array 배열을 처음부터 끝까지 순회
        for (int i = 0; i < array.length; i++) {
            // (array[i] != 0)이 아닐 때(array[i]가 0이 될 때)까지 반복
            while (array[i] != 0) {
                // 만약 array[i]를 10으로 나눈 나머지가 7일 때
                if (array[i] % 10 == 7) {
                    answer++; // 정답에 1증가
                }
                // 이후 array[i]를 10으로 나눠서 다음 자리 수 탐색
                array[i] /= 10;
            }
        }
        return answer;
    }
}