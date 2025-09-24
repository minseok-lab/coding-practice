class Solution {
    boolean solution(String s) {
        // 정답은 boolean 타입 true거나 false
        boolean answer = true;
        
        // 비교를 위한 pCount, yCount 선언
        int pCount = 0;
        int yCount = 0;
        
        // 0부터 문자열 s의 길이만큼 s.charAt(i)를 순회
        for (int i = 0 ; i < s.length(); i++) {
            // switch-case를 활용하여 p와 P, y와 Y인 경우를 탐색
            switch (s.charAt(i)) {
                case 'p':
                case 'P':
                    pCount++;
                    break;
                case 'y':
                case 'Y':
                    yCount++;
                    break;
            }
        }
        
        // 만약 p와 y 갯수가 다를 경우, false
        if (pCount != yCount) {
            answer = false;
        }
        
        // 검증 단계
        System.out.println(pCount + " = " + yCount);
        System.out.println(answer);
        
        return answer;
    }
}