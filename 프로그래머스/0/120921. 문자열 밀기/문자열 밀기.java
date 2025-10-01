class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        // A랑 B랑 같으면 0
        if (A.equals(B)) {
            answer = 0;
        } else if (!(A+A).contains(B)) { // A+A가 B를 포함하지 않을 경우
            answer = -1;
        } else { // A+A가 B를 포함한다면
            for (int i = 0; i < A.length(); i++) {
                // A는 마지막 글자 + 0부터 나머지 글자
                A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
                if (A.equals(B)) {
                    answer = i + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}