class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        // 변경할 문자를 담을 임시 문자열 생성
        String changeString = "";
        // myString을 순회하며 charAt(i)가 A면 B, B면 A로 변환하여 임시 문자열에 삽입
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'A') {
                changeString += "B";
            } else {
                changeString += "A";
            }
        }
        // 변경된 문자열에 pat이 포함되어 있으면 정답은 1
        if (changeString.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}