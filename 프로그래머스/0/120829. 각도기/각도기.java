class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90){ // 0 초과 90미만일 경우
            answer = 1; //정답은 1
        }
        else if (angle == 90){ // 90일 경우
            answer = 2; //정답은 2
        }
        else if (90 < angle && angle < 180){ //90초과 180 미만일 경우
            answer = 3; //정답은 3
        }
        else if (angle == 180){ //180일 경우
            answer = 4; //정답은 4
        }
        return answer;
    }
}