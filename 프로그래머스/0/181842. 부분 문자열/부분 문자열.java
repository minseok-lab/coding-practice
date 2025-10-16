class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // 포함 여부 탐색을 위한 contains 활용
        if (str2.contains(str1)) {
            answer = 1;
        }
        return answer;
    }
}