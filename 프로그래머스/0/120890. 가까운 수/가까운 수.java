class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        // 가장 적은 차이값을 구하기 위한 변수 선언, int의 최대값으로 추기화
        int minGap = Integer.MAX_VALUE;
        
        // array 배열을 순회
        for (int i = 0; i < array.length; i++) {
            // Math.abs(숫자) 함수를 사용하면 어떤 수가 들어오든 항상 양수인 절댓값을 반환
            // array[i] - n이 차이값보다 작을 경우
            if (Math.abs(array[i] - n) < minGap) {
                // 정답은 array[i], 최소 차이값 초기화
                answer = array[i];
                minGap = Math.abs(array[i] - n);
            // 만약 동일한 수가 발생했을 경우
            } else if (Math.abs(array[i] - n) == minGap) {
                if (array[i] < answer) {
                    // 기존 정답과 array[i]를 비교해서 더 작은 값으로 초기화
                    answer = array[i];
                    minGap = Math.abs(array[i] - n);
                }
            }
        }
        return answer;
    }
}