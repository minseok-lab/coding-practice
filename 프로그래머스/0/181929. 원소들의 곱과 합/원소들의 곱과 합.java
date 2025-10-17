class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sumInt = 0;
        int multInt = 1;
        
        // num_list 배열을 순회하며 모든 값을 더함
        for (int i = 0; i < num_list.length; i++) {
            sumInt += num_list[i];
        }
        // num_list 배열을 순회하며 모든 값을 곱함
        for (int i = 0; i < num_list.length; i++) {
            multInt *= num_list[i];
        }
        // 합의 제곱이 모든 값의 곱보다 클 경우 정답은 1
        if ((sumInt * sumInt) > multInt) {
            answer = 1;
        }
        return answer;
    }
}