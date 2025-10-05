class Solution {
    public int[] solution(int[][] score) {
        // 합 배열 구하기
        int[] sumScore = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            // 합 배열 i번째 값은 score 배열의 i번째 배열의 값의 합
            sumScore[i] = score[i][0] + score[i][1];
        }
        
        // 등수 배열 구하기
        int[] rank = new int[sumScore.length];
        for (int i = 0; i < sumScore.length; i++) {
            for (int j = 0; j < sumScore.length; j++) {
                // 평균 배열의 i번째 값보다 큰 경우가 있을 경우
                if (sumScore[i] < sumScore[j]) {
                    rank[i]++; // rank 증가
                }
            }
            // 0부터 시작이므로 미리 1 추가
            rank[i] += 1;
        }
        return rank;
    }
}