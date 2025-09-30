class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        // 체크할 문자의 배열을 확인합니다.
        String[] check = { "aya", "ye", "woo", "ma" };
        
        // babbling 배열을 순회
        for (int i = 0; i < babbling.length; i++) {
            // 체크할 문자의 배열을 순회
            for (int j = 0; j < check.length; j++) {
                // 만약 babbling[i] 가 check 문자열을 포함할 경우
                if (babbling[i].contains(check[j])) {
                    // babbling[i]의 check 문자열을 공백으로 변경
                    babbling[i] = babbling[i].replace(check[j], " ");
                }
            }
            // 만약 공백을 제외한 babbling[i]가 ""와 같을 때 정답에 1추가
            if (babbling[i].trim().equals("")) {
                answer++;
            }
        }
        return answer;
    }
}