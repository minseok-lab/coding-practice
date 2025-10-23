import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hallOfFame = new int[k];
        Arrays.fill(hallOfFame, 2001);

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                hallOfFame[i] = score[i];
                Arrays.sort(hallOfFame);
                answer[i] = hallOfFame[0];
            } else {
                if (hallOfFame[0] < score[i]) {
                    hallOfFame[0] = score[i];
                }
                Arrays.sort(hallOfFame);
                answer[i] = hallOfFame[0];
            }
        }
        return answer;
    }
}