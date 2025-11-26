class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        
        // 4개의 벽 선언
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        
        // num을 다 채울때까지 반복, 같아졌을 때 탈출
        while (num <= n * n) {
            // i는 left부터 right까지 하나씩 늘어나며 입력
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            // 상단이 다 채워졌으므로 하나 추가
            top++;
            // i 는 top부터 bottom까지 하나씩 늘어나며 반복
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            // 맨 오른쪽이 다 채워졌으므로 하나 빼기
            right--;
            
            // 만약 아직 채울 공간이 남아있다면
            if (top <= bottom) {
                //오른쪽에서 왼쪽으로
                for (int i = right; i >= left; i--) {
                    answer[bottom][i] = num++;
                }
                bottom--;
            }
            // 채울 공간이 남아있다면
            if (left <= right) {
                // 아래에서 위로
                for (int i = bottom; i >= top; i--) {
                    answer[i][left] = num++;
                }
                left++;
            }
        }
        
        return answer;
    }
}