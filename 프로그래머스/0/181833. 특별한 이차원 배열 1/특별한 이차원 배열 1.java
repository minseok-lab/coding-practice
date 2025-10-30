class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (j == index) {
                    answer[i][j] = 1;
                }
            }
            index++;
        }
        return answer;
    }
}