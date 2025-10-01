class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for (int i = 0; i < keyinput.length; i++) {
            // 입력 키값을 받아서 이동합니다.
            if (keyinput[i].equals("left")) {
                answer[0] -= 1;
            } else if (keyinput[i].equals("right")) {
                answer[0] += 1;
            } else if (keyinput[i].equals("up")) {
                answer[1] += 1;
            } else {
                answer[1] -= 1;
            }
            
            // 이동한 값을 검증해서 범위를 넘어갈 경우 되돌립니다.
            if (answer[0] > (board[0] / 2)) {
                answer[0] -= 1;
            } else if (answer[0] < 0 - (board[0] / 2)) {
                answer[0] += 1;
            } else if (answer[1] > (board[1] / 2)) {
                answer[1] -= 1;
            } else if (answer[1] < 0 - (board[1] / 2)) {
                answer[1] += 1;
            }
        }
        return answer;
    }
}