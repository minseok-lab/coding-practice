class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int startNum = 0;
        if (num % 2 == 0) {
            startNum = (total / num) - (num / 2) + 1;
        } else {
            startNum = (total / num) - (num / 2);
        }
        
        for (int index = 0; index < num; index++) {
            answer[index] = startNum;
            startNum++;
        }
        return answer;
    }
}