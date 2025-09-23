class Solution {
    public int solution(int n, int k) {
        int answer = (12000 * n) + (2000 * (k - (n / 10)));
        // 12000 * n인문 + 2000 * n병 - 2000 * n / 10병
        // int 변수이므로 10으로 나눠진 소수점 값은 자동으로 제외
        return answer;
    }
}