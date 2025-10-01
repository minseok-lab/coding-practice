class Solution {
    public int solution(int chicken) {
        int answer = 0;
        // 주문할 수 있는 치킨이 0마리가 될 때까지 반복
        while (chicken != 0) {
            // 정답에 시킬 수 있는 치킨 수 추가
            answer += chicken / 10;
            // 남은 쿠폰 수는 쿠폰으로 시킨 치킨으로 생긴 치킨 + 남은 쿠폰의 수
            chicken = (chicken / 10) + (chicken % 10);
            // 만약 더이상 시킬 수 없으면 반복문 탈출
            if (chicken / 10 == 0) {
                break;
            }
        }
        return answer;
    }
}