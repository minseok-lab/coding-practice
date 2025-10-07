class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int index = 0;
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                
                // 절댓값 i번째 수에서 n을 뺀 수가 j번째 수에서 n을 뺀 수보다 크다면
                if (Math.abs(numlist[i] - n) > Math.abs(numlist[j] - n)) {
                    // index 값 추가
                    index++;
                // 동일한 값이 존재할 경우
                } else if (Math.abs(numlist[i] - n) == Math.abs(numlist[j] - n)) {
                    // 더 큰값이 있으면 index 값 추가
                    if (numlist[i] < numlist[j]) {
                        index++;
                    }
                }
            }
            // 정답의 index 번째는 numlist의 i번째 수
            answer[index] = numlist[i];
            // index 0으로 초기화
            index = 0;
        }
        return answer;
    }
}