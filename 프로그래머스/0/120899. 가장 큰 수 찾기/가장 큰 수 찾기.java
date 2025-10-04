import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        // 정답 배열 선언
        int[] answer = new int[2];
        
        // 비교를 위한 기준값들을 배열의 첫 번째 값으로 초기화
        int max = array[0];
        int maxIndex = 0;
        
        // 배열을 순회하며 최댓값과 그 인덱스를 찾는다.
        for (int i = 1; i < array.length; i++) {
            // 만약 현재 값이 최댓값보다 크면
            if (array[i] > max) {
                // 현재 값으로 업데이트
                max = array[i];
                maxIndex = i;
            }
        }

        answer[0] = max;
        answer[1] = maxIndex;
        
        return answer;
    }
}