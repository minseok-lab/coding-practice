class Solution {
    public int solution(int[][] dots) {
        // x와 y의 최소, 최댓값 정의
        int answer = 0;
        int maxX = -256;
        int maxY = -256;
        int minX = 256;
        int minY = 256;
    
        // dots 배열 순회하며 각각의 dots 값 비교
        for (int i = 0; i < 4; i++) {
            if (dots[i][0] > maxX ) {
                maxX = dots[i][0];
            }
            if (dots[i][0] < minX ) {
                minX = dots[i][0];
            }
            if (dots[i][1] > maxY ) {
                maxY = dots[i][1];
            }
            if (dots[i][0] < minY ) {
                minY = dots[i][1];
            }
        }
        
        // 정답은 x와 y의 (최댓값 - 최소값)의 곱
        answer = (maxX - minX) * (maxY - minY);
        return answer;
    }
}