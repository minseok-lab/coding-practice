class Solution {
    public int solution(int hp) {
        int answer =
            // hp를 5로 나눈 몫(장군개미) + 남은 hp를 3으로 나눈 몫(병정개미) + 나머지 hp
            (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);
        return answer;
    }
}