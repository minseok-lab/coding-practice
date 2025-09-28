class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // a와 b를 각각 문자열로 변환 후 붙혀씀
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        String abStr = aStr + bStr;
        String baStr = bStr + aStr;
        
        // 붙혀쓴 abStr, baStr를 정수값으로 변환
        int abInt = Integer.parseInt(abStr);
        int baInt = Integer.parseInt(baStr);
        
        // abStr, baStr 비교
        if (abInt >= baInt) {
            answer = abInt;
        } else {
            answer = baInt;
        }
        
        return answer;
    }
}