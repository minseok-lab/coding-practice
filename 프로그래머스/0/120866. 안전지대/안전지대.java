class Solution {
    public int solution(int[][] board) {
        /*
        int answer = 0;
        // 임시 배열 생성
        int[][] tempBoard = new int[board.length][board.length];
        
        // 원본 board 배열을 순회하며 폭탄 위치 탐색
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    // i와 j를 기준으로, 주변 8칸과 자기 자신을 탐색
                    // 폭탄이 있는 위치의 [i-1][j-1] 부터 [i+1][j+1] 범위까지 1 추가
                    for (int row = i - 1; row <= i + 1; row++) {
                        for (int col = j - 1; col <= j + 1; col++) {
                            // row와 col이 배열의 유효한 범위(0 <= row < n 등) 안에 있는지 확인
                            if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
                            // 유효하다면 임시 배열의 해당 위치를 위험 지역으로 표시
                            tempBoard[row][col] = 1;
                            }
                        }
                    }
                }
            }
        }
        // 임시 배열을 탐색하며 0 갯수 확인
        for (int i = 0; i < tempBoard.length; i++) {
            for (int j = 0; j < tempBoard.length; j++) {
                if (tempBoard[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
    */
        int n = board.length;
        int[][] tempBoard = new int[n][n];

        // 1. board를 순회하며 폭탄 위치를 찾는다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    // 2. 폭탄을 찾으면, 주변을 위험 지역으로 표시하라고 "지시"한다.
                    markDangerZone(i, j, tempBoard);
                }
            }
        }

        // 3. 안전 지역의 개수를 센다.
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tempBoard[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }

    // (i, j)를 중심으로 3x3 영역을 위험 지역(1)으로 표시하는 메소드
    private void markDangerZone(int i, int j, int[][] tempBoard) {
        int n = tempBoard.length;
        for (int row = i - 1; row <= i + 1; row++) {
            for (int col = j - 1; col <= j + 1; col++) {
                // 경계를 벗어나지 않는 유효한 칸만
                if (row >= 0 && row < n && col >= 0 && col < n) {
                    tempBoard[row][col] = 1;
                }
            }
        }
    }
}