class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        // 길이를 남길 새로운 배열 생성
        int[] line = new int[201];
        // lines 배열을 순회
        for (int i = 0; i < lines.length; i++) {
            // strat 값부터 end 값까지 반복하며 line 배열에 추가
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                line[j + 100]++;
            }
        }
        // line 배열에 2 이상인 값이 있을 경우 중복된 길이
        for (int i = 0; i < line.length; i++) {
            if (line[i] >= 2) {
                answer++;
            }
        }
        return answer;
    }
}