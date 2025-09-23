class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int multiNum = 1; multiNum <= 1000; multiNum++) {
            if (multiNum * multiNum == n) {
                answer = 1;
                break;
            }
            else {
                answer = 2;
            }
        }
        return answer;
    }
}