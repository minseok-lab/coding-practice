class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [arr.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (queries[i][2] == 0) {
                    arr[0]++;
                }
                if (j % queries[i][2] == 0){
                    arr[j]++;
                }
            }
        }
        answer = arr;
        return answer;
    }
}